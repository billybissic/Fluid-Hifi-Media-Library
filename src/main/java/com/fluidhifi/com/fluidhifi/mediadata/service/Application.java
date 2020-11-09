package com.fluidhifi.com.fluidhifi.mediadata.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private SettingsRepository settingsRepository;
	@Autowired
	private LibraryRepository libraryRepository;
	@Autowired
	private LibraryAudioRepository libraryAudioRepository;
	@Autowired
	private LibraryDirectoryRepository libraryDirectoryRepository;
	@Autowired
	private MediaCategoryRepository mediaCategoryRepository;
	@Autowired
	private SupportedFileTypeRepository supportedFileTypeRepository;

	private String me = "fluidhifi.mediadata.service";
	private List<Settings> settings = new ArrayList<Settings>();
	private List<LibraryDirectory> musicDirectories = new ArrayList<LibraryDirectory>();
	private List<LibraryDirectory> audioBookDirectories = new ArrayList<LibraryDirectory>();
	private List<LibraryDirectory> movieDirectories = new ArrayList<LibraryDirectory>();
	private List<LibraryDirectory> tvDirectories = new ArrayList<LibraryDirectory>();
	private List<Library> libraries = new ArrayList<Library>();
	private List<MediaCategory> mediaCategories = new ArrayList<MediaCategory>();
	private List<SupportedFileType> supportedAudioFileTypes = new ArrayList<SupportedFileType>();
	private String operatingSystem;
	private Integer musicMediaCategoryId;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Fluid-Hifi data management service started successfully.");
		
		logger.info("Retreiving Operating System...");
		retrieveOperatingSystem();
		displayOperatingSystem();
		logger.info("Done.");
		
		logger.info("Retrieving Application Settings...");
		retrieveApplicationSettings();
		displayApplicationSettings();
		logger.info("Done.");
		
		logger.info("Retrieiving Libraries...");
		retrieveLibraries();
		displayLibraries();
		logger.info("Done.");
		
		logger.info("Retrieiving Media Categories...");
		retrieveMediaCategories();
		displayMediaCategories();
		logger.info("Done.");
		
		retrieveMusicDirectories();
		
		logger.info("Retrieving Supported Audio File Types...");
		retrieveSupportedAudioFileTypes();
		displaySupportedAudioFileTypes();
		logger.info("Done.");
		// displayMusicDirectories();
		readAudioDirectories();
	}

	private void displayApplicationSettings() {
		// TODO Auto-generated method stub
		
	}

	private void retrieveApplicationSettings() {
		this.settings = this.settingsRepository.findByApplicationNameAndOS(this.me, this.operatingSystem);
	}

	// #1
	/* need to know the platform to filter the settings out on */
	public void retrieveOperatingSystem() {
		this.operatingSystem = SystemUtils.OS_NAME;
	}
	
	public void displayOperatingSystem() {
		logger.info(this.operatingSystem);
	}

	// #2
	/* get all libraries scan directories */
	public void retrieveLibraries() {
		this.libraries = libraryRepository.findAll();
	}

	public void displayLibraries() {
		for (int i = 0; i < this.libraries.size(); i++) {
			System.out.println(this.libraries.get(i).getLibraryName());
		}
	}

	public void retrieveMediaCategories() {
		this.mediaCategories = mediaCategoryRepository.findAll();
	}

	public void retrieveSupportedAudioFileTypes() {
		this.supportedAudioFileTypes = supportedFileTypeRepository.findByMediaCategory(this.musicMediaCategoryId);
	}

	public void displaySupportedAudioFileTypes() {
		for (int i = 0; i < this.supportedAudioFileTypes.size(); i++) {
			System.out.println(this.supportedAudioFileTypes.get(i).getSupportedFileTypeExt());
		}
	}

	public void displayMediaCategories() {
		for (int i = 0; i < this.mediaCategories.size(); i++) {
			System.out.println(this.mediaCategories.get(i).getMediaCategory());
		}
	}

	public void retrieveMusicDirectories() {

		/* get media category id for music */
		if (!this.mediaCategories.isEmpty()) {
			System.out.println("mediaCategories is not empty");
			for (int i = 0; i < this.mediaCategories.size() - 1; i++) {
				if (this.mediaCategories.get(i).getMediaCategory().contains("Music")) {
					this.musicMediaCategoryId = this.mediaCategories.get(i).getMediaCategoryId();
					System.out.println(this.mediaCategories.get(i).getMediaCategoryId());
					System.out.println(this.mediaCategories.get(i).getMediaCategory());
					System.out.println(this.mediaCategories.get(i).getMediaCategoryDescription());
					break;
				}
			}
		}

		/* get all music libraries */
		System.out.println("Finding directories for media category id: " + this.musicMediaCategoryId);
		List<Library> musicLibraries = libraryRepository.findByMediaCategory(this.musicMediaCategoryId);

		/* get all directories */
		if (!musicLibraries.isEmpty()) {
			System.out.println("musicLibraries is not empty");
			for (int i = 0; i <= musicLibraries.size() - 1; i++) {
				List<LibraryDirectory> libraryDirectories = libraryDirectoryRepository
						.findAllByLibraryId(musicLibraries.get(i).getLibraryId());

				if (!libraryDirectories.isEmpty()) {

					for (int x = 0; x <= libraryDirectories.size() - 1; x++) {
						System.out.println("iteration count: " + x);
						LibraryDirectory libraryDirectory = new LibraryDirectory();
						System.out.println(libraryDirectories.get(x).getDirectoryId());
						System.out.println(libraryDirectories.get(x).getDirectoryPath());
						System.out.println("i " + libraryDirectories.get(x).getLibraryId());
						libraryDirectory.setDirectoryId(libraryDirectories.get(x).getDirectoryId());
						libraryDirectory.setDirectoryPath(libraryDirectories.get(x).getDirectoryPath());
						libraryDirectory.setLibraryId(libraryDirectories.get(x).getLibraryId());
						System.out.println(libraryDirectory.toString());

						this.musicDirectories.add(libraryDirectory);
					}
				} else {
					break;
				}
			}
		}
	}

	public void displayMusicDirectories() {
		for (int i = 0; i < this.musicDirectories.size(); i++) {
			System.out.println(this.musicDirectories.get(i));
		}
	}

	// #3 (optional for now)
	/* get all media scan intervals */
	public void retrieveScanIntervals() {

	}

	// #4
	/* get all audio files */
	public void readAudioDirectories() {
		System.out.println("Beggining audio scan...");
		if (this.musicDirectories != null) {
			for (int i = 0; i < this.musicDirectories.size(); i++) {
				readAudioDirectory(this.musicDirectories.get(i).getDirectoryPath());
			}
		}
	}

	public boolean isThisFileSupported(File f) {
		boolean fileTypeSupported = false;
		for (int i = 0; i < this.supportedAudioFileTypes.size(); i++) {
			if (f.getName().contains(this.supportedAudioFileTypes.get(i).getSupportedFileTypeExt())) {
				fileTypeSupported = true;
				break;
			}
		}
		return fileTypeSupported;
	}

	public void readAudioDirectory(String directory) {
		File folder = new File(directory);
		if (folder.listFiles() != null) {
			for (File f : folder.listFiles()) {

				System.out.println(f.getName());
				System.out.println(f.getParent());
				System.out.println(f.getPath());
				try {

					//if (f.isFile()) {
						if (isThisFileSupported(f)) {
							/* extract ID3 Data */
							AudioFileData audioFileData = new AudioFileData();
							audioFileData.ExtractAudioData(f);
							System.out.println("Checking file support ... " + audioFileData.toString());

							/* put extracted data into audio object */
							LibraryAudio audio = new LibraryAudio();
							audio = audioFileData.InsertIntoAudioFile();

							/* update name and path */
							audio.setFileName(f.getName());
							audio.setFilePath(f.getPath());

							/* save to database */
							libraryAudioRepository.save(audio);
						}
					//}
					readAudioDirectory(f.toString());
				} catch (CannotReadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NullPointerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (TagException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ReadOnlyFileException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidAudioFrameException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
}
