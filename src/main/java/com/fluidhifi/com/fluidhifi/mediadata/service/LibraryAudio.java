/**
 * 
 */
package com.fluidhifi.com.fluidhifi.mediadata.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author lahjeq taylor
 *
 */

@Entity
@Table(name = "audio")
public class LibraryAudio {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "audio_id")
	private Long audioId;
	@Column(name = "library_id")
	private Integer libraryId;
	@Column(name = "file_name")
	private String fileName;
	@Column(name = "file_path")
	private String filePath;
	@Column(name = "artist")
	private String artist;
	@Column(name = "title")
	private String title;
	@Column(name = "track")
	private String track;
	@Column(name = "track_total")
	private String trackTotal;
	@Column(name = "genre")
	private String genre;
	@Column(name = "album")
	private String album;
	@Column(name = "album_artist")
	private String albumArtist;
	@Column(name = "composer")
	private String composer;
	@Column(name = "year")
	private String year;
	@Column(name = "record_label")
	private String recordLabel;
	@Column(name = "lyrcist")
	private String lyrcist;
	@Column(name = "language")
	private String language;
	@Column(name = "key")
	private String key;
	@Column(name = "conductor")
	private String conductor;
	@Column(name = "remixer")
	private String remixer;
	@Column(name = "mood")
	private String mood;
	@Column(name = "media")
	private String media;
	@Column(name = "comment")
	private String comment;
	@Column(name = "grouping")
	private String grouping;
	@Column(name = "disc_number")
	private String discNumber;
	@Column(name = "disc_total")
	private String discTotal;
	@Column(name = "cover_art")
	private String coverArt;
	@Column(name = "bpm")
	private String bpm;
	@Column(name = "lyrics")
	private String lyrics;
	@Column(name = "is_compilation")
	private String isCompilation;
	@Column(name = "encoder")
	private String encoder;
	@Column(name = "isrc")
	private String isrc;
	@Column(name = "barcode")
	private String barcode;
	@Column(name = "catalogue_number")
	private String catalogueNumber;
	@Column(name = "amazon_id")
	private String amazonId;
	@Column(name = "music_brainz_artist_id")
	private String musicBrainzArtistId;
	@Column(name = "music_brainz_disc_id")
	private String musicBrainzDiscId;
	@Column(name = "music_brainz_release_country")
	private String musicBrainzReleaseCountry;
	@Column(name = "music_brainz_release_status")
	private String musicBrainzReleaseStatus; 
	@Column(name = "music_brainz_release_type")
	private String musicBrainzReleaseType;
	@Column(name = "music_brainz_release_artist_id")
	private String musicBrainzReleaseArtistId;
	@Column(name = "music_brainz_release_id")
	private String musicBrainzReleaseId;
	@Column(name = "music_brainz_track_id")
	private String musicBrainzTrackId;
	@Column(name = "music_ip_id")
	private String musicIpId;
	@Column(name = "title_sort")
	private String titleSort;
	@Column(name = "artist_sort")
	private String artistSort;
	@Column(name = "album_sort")
	private String albumSort;
	@Column(name = "album_artist_sort")
	private String albumArtistSort;
	@Column(name = "composer_sort")
	private String composerSort;
	@Column(name = "url_discogs_artist_site")
	private String urlDiscogsArtistSite;
	@Column(name = "url_discogs_release_site")
	private String urlDiscogsReleaseSite;
	@Column(name = "url_lyrics_site")
	private String urlLyricsSite;
	@Column(name = "url_official_artist_site")
	private String urlOfficialArtistSite;
	@Column(name = "url_official_release_site")
	private String urlOfficialReleaseSite;
	@Column(name = "url_wikipedia_release_site")
	private String urlWikipediaReleaseSite;
	@Column(name = "url_wikipedia_artist_site")
	private String urlWikipediaArtistSite;
	/**
	 * @return the audioId
	 */
	public Long getAudioId() {
		return audioId;
	}
	/**
	 * @param audioId the audioId to set
	 */
	public void setAudioId(Long audioId) {
		this.audioId = audioId;
	}
	public Integer getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}
	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the track
	 */
	public String getTrack() {
		return track;
	}
	/**
	 * @param track the track to set
	 */
	public void setTrack(String track) {
		this.track = track;
	}
	/**
	 * @return the trackTotal
	 */
	public String getTrackTotal() {
		return trackTotal;
	}
	/**
	 * @param trackTotal the trackTotal to set
	 */
	public void setTrackTotal(String trackTotal) {
		this.trackTotal = trackTotal;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return the albumArtist
	 */
	public String getAlbumArtist() {
		return albumArtist;
	}
	/**
	 * @param albumArtist the albumArtist to set
	 */
	public void setAlbumArtist(String albumArtist) {
		this.albumArtist = albumArtist;
	}
	/**
	 * @return the composer
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * @param composer the composer to set
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the recordLabel
	 */
	public String getRecordLabel() {
		return recordLabel;
	}
	/**
	 * @param recordLabel the recordLabel to set
	 */
	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}
	/**
	 * @return the lyrcist
	 */
	public String getLyrcist() {
		return lyrcist;
	}
	/**
	 * @param lyrcist the lyrcist to set
	 */
	public void setLyrcist(String lyrcist) {
		this.lyrcist = lyrcist;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the conductor
	 */
	public String getConductor() {
		return conductor;
	}
	/**
	 * @param conductor the conductor to set
	 */
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	/**
	 * @return the remixer
	 */
	public String getRemixer() {
		return remixer;
	}
	/**
	 * @param remixer the remixer to set
	 */
	public void setRemixer(String remixer) {
		this.remixer = remixer;
	}
	/**
	 * @return the mood
	 */
	public String getMood() {
		return mood;
	}
	/**
	 * @param mood the mood to set
	 */
	public void setMood(String mood) {
		this.mood = mood;
	}
	/**
	 * @return the media
	 */
	public String getMedia() {
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(String media) {
		this.media = media;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the grouping
	 */
	public String getGrouping() {
		return grouping;
	}
	/**
	 * @param grouping the grouping to set
	 */
	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}
	/**
	 * @return the discNumber
	 */
	public String getDiscNumber() {
		return discNumber;
	}
	/**
	 * @param discNumber the discNumber to set
	 */
	public void setDiscNumber(String discNumber) {
		this.discNumber = discNumber;
	}
	/**
	 * @return the discTotal
	 */
	public String getDiscTotal() {
		return discTotal;
	}
	/**
	 * @param discTotal the discTotal to set
	 */
	public void setDiscTotal(String discTotal) {
		this.discTotal = discTotal;
	}
	/**
	 * @return the coverArt
	 */
	public String getCoverArt() {
		return coverArt;
	}
	/**
	 * @param coverArt the coverArt to set
	 */
	public void setCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}
	/**
	 * @return the bpm
	 */
	public String getBpm() {
		return bpm;
	}
	/**
	 * @param bpm the bpm to set
	 */
	public void setBpm(String bpm) {
		this.bpm = bpm;
	}
	/**
	 * @return the lyrics
	 */
	public String getLyrics() {
		return lyrics;
	}
	/**
	 * @param lyrics the lyrics to set
	 */
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	/**
	 * @return the isCompilation
	 */
	public String getIsCompilation() {
		return isCompilation;
	}
	/**
	 * @param isCompilation the isCompilation to set
	 */
	public void setIsCompilation(String isCompilation) {
		this.isCompilation = isCompilation;
	}
	/**
	 * @return the encoder
	 */
	public String getEncoder() {
		return encoder;
	}
	/**
	 * @param encoder the encoder to set
	 */
	public void setEncoder(String encoder) {
		this.encoder = encoder;
	}
	/**
	 * @return the isrc
	 */
	public String getIsrc() {
		return isrc;
	}
	/**
	 * @param isrc the isrc to set
	 */
	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}
	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}
	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
	 * @return the catalogueNumber
	 */
	public String getCatalogueNumber() {
		return catalogueNumber;
	}
	/**
	 * @param catalogueNumber the catalogueNumber to set
	 */
	public void setCatalogueNumber(String catalogueNumber) {
		this.catalogueNumber = catalogueNumber;
	}
	/**
	 * @return the amazonId
	 */
	public String getAmazonId() {
		return amazonId;
	}
	/**
	 * @param amazonId the amazonId to set
	 */
	public void setAmazonId(String amazonId) {
		this.amazonId = amazonId;
	}
	/**
	 * @return the musicBrainzArtistId
	 */
	public String getMusicBrainzArtistId() {
		return musicBrainzArtistId;
	}
	/**
	 * @param musicBrainzArtistId the musicBrainzArtistId to set
	 */
	public void setMusicBrainzArtistId(String musicBrainzArtistId) {
		this.musicBrainzArtistId = musicBrainzArtistId;
	}
	/**
	 * @return the musicBrainzDiscId
	 */
	public String getMusicBrainzDiscId() {
		return musicBrainzDiscId;
	}
	/**
	 * @param musicBrainzDiscId the musicBrainzDiscId to set
	 */
	public void setMusicBrainzDiscId(String musicBrainzDiscId) {
		this.musicBrainzDiscId = musicBrainzDiscId;
	}
	/**
	 * @return the musicBrainzReleaseCountry
	 */
	public String getMusicBrainzReleaseCountry() {
		return musicBrainzReleaseCountry;
	}
	/**
	 * @param musicBrainzReleaseCountry the musicBrainzReleaseCountry to set
	 */
	public void setMusicBrainzReleaseCountry(String musicBrainzReleaseCountry) {
		this.musicBrainzReleaseCountry = musicBrainzReleaseCountry;
	}
	/**
	 * @return the musicBrainzReleaseStatus
	 */
	public String getMusicBrainzReleaseStatus() {
		return musicBrainzReleaseStatus;
	}
	/**
	 * @param musicBrainzReleaseStatus the musicBrainzReleaseStatus to set
	 */
	public void setMusicBrainzReleaseStatus(String musicBrainzReleaseStatus) {
		this.musicBrainzReleaseStatus = musicBrainzReleaseStatus;
	}
	/**
	 * @return the musicBrainzReleaseType
	 */
	public String getMusicBrainzReleaseType() {
		return musicBrainzReleaseType;
	}
	/**
	 * @param musicBrainzReleaseType the musicBrainzReleaseType to set
	 */
	public void setMusicBrainzReleaseType(String musicBrainzReleaseType) {
		this.musicBrainzReleaseType = musicBrainzReleaseType;
	}
	/**
	 * @return the musicBrainzReleaseArtistId
	 */
	public String getMusicBrainzReleaseArtistId() {
		return musicBrainzReleaseArtistId;
	}
	/**
	 * @param musicBrainzReleaseArtistId the musicBrainzReleaseArtistId to set
	 */
	public void setMusicBrainzReleaseArtistId(String musicBrainzReleaseArtistId) {
		this.musicBrainzReleaseArtistId = musicBrainzReleaseArtistId;
	}
	/**
	 * @return the musicBrainzReleaseId
	 */
	public String getMusicBrainzReleaseId() {
		return musicBrainzReleaseId;
	}
	/**
	 * @param musicBrainzReleaseId the musicBrainzReleaseId to set
	 */
	public void setMusicBrainzReleaseId(String musicBrainzReleaseId) {
		this.musicBrainzReleaseId = musicBrainzReleaseId;
	}
	/**
	 * @return the musicBrainzTrackId
	 */
	public String getMusicBrainzTrackId() {
		return musicBrainzTrackId;
	}
	/**
	 * @param musicBrainzTrackId the musicBrainzTrackId to set
	 */
	public void setMusicBrainzTrackId(String musicBrainzTrackId) {
		this.musicBrainzTrackId = musicBrainzTrackId;
	}
	/**
	 * @return the musicIpId
	 */
	public String getMusicIpId() {
		return musicIpId;
	}
	/**
	 * @param musicIpId the musicIpId to set
	 */
	public void setMusicIpId(String musicIpId) {
		this.musicIpId = musicIpId;
	}
	/**
	 * @return the titleSort
	 */
	public String getTitleSort() {
		return titleSort;
	}
	/**
	 * @param titleSort the titleSort to set
	 */
	public void setTitleSort(String titleSort) {
		this.titleSort = titleSort;
	}
	/**
	 * @return the artistSort
	 */
	public String getArtistSort() {
		return artistSort;
	}
	/**
	 * @param artistSort the artistSort to set
	 */
	public void setArtistSort(String artistSort) {
		this.artistSort = artistSort;
	}
	/**
	 * @return the albumSort
	 */
	public String getAlbumSort() {
		return albumSort;
	}
	/**
	 * @param albumSort the albumSort to set
	 */
	public void setAlbumSort(String albumSort) {
		this.albumSort = albumSort;
	}
	/**
	 * @return the albumArtistSort
	 */
	public String getAlbumArtistSort() {
		return albumArtistSort;
	}
	/**
	 * @param albumArtistSort the albumArtistSort to set
	 */
	public void setAlbumArtistSort(String albumArtistSort) {
		this.albumArtistSort = albumArtistSort;
	}
	/**
	 * @return the composerSort
	 */
	public String getComposerSort() {
		return composerSort;
	}
	/**
	 * @param composerSort the composerSort to set
	 */
	public void setComposerSort(String composerSort) {
		this.composerSort = composerSort;
	}
	/**
	 * @return the urlDiscogsArtistSite
	 */
	public String getUrlDiscogsArtistSite() {
		return urlDiscogsArtistSite;
	}
	/**
	 * @param urlDiscogsArtistSite the urlDiscogsArtistSite to set
	 */
	public void setUrlDiscogsArtistSite(String urlDiscogsArtistSite) {
		this.urlDiscogsArtistSite = urlDiscogsArtistSite;
	}
	/**
	 * @return the urlDiscogsReleaseSite
	 */
	public String getUrlDiscogsReleaseSite() {
		return urlDiscogsReleaseSite;
	}
	/**
	 * @param urlDiscogsReleaseSite the urlDiscogsReleaseSite to set
	 */
	public void setUrlDiscogsReleaseSite(String urlDiscogsReleaseSite) {
		this.urlDiscogsReleaseSite = urlDiscogsReleaseSite;
	}
	/**
	 * @return the urlLyricsSite
	 */
	public String getUrlLyricsSite() {
		return urlLyricsSite;
	}
	/**
	 * @param urlLyricsSite the urlLyricsSite to set
	 */
	public void setUrlLyricsSite(String urlLyricsSite) {
		this.urlLyricsSite = urlLyricsSite;
	}
	/**
	 * @return the urlOfficialArtistSite
	 */
	public String getUrlOfficialArtistSite() {
		return urlOfficialArtistSite;
	}
	/**
	 * @param urlOfficialArtistSite the urlOfficialArtistSite to set
	 */
	public void setUrlOfficialArtistSite(String urlOfficialArtistSite) {
		this.urlOfficialArtistSite = urlOfficialArtistSite;
	}
	/**
	 * @return the urlOfficialReleaseSite
	 */
	public String getUrlOfficialReleaseSite() {
		return urlOfficialReleaseSite;
	}
	/**
	 * @param urlOfficialReleaseSite the urlOfficialReleaseSite to set
	 */
	public void setUrlOfficialReleaseSite(String urlOfficialReleaseSite) {
		this.urlOfficialReleaseSite = urlOfficialReleaseSite;
	}
	/**
	 * @return the urlWikipediaReleaseSite
	 */
	public String getUrlWikipediaReleaseSite() {
		return urlWikipediaReleaseSite;
	}
	/**
	 * @param urlWikipediaReleaseSite the urlWikipediaReleaseSite to set
	 */
	public void setUrlWikipediaReleaseSite(String urlWikipediaReleaseSite) {
		this.urlWikipediaReleaseSite = urlWikipediaReleaseSite;
	}
	/**
	 * @return the urlWikipediaArtistSite
	 */
	public String getUrlWikipediaArtistSite() {
		return urlWikipediaArtistSite;
	}
	/**
	 * @param urlWikipediaArtistSite the urlWikipediaArtistSite to set
	 */
	public void setUrlWikipediaArtistSite(String urlWikipediaArtistSite) {
		this.urlWikipediaArtistSite = urlWikipediaArtistSite;
	}
	public LibraryAudio(Long audioId, Integer libraryId, String fileName, String filePath, String artist, String title, String track,
			String trackTotal, String genre, String album, String albumArtist, String composer, String year,
			String recordLabel, String lyrcist, String language, String key, String conductor, String remixer,
			String mood, String media, String comment, String grouping, String discNumber, String discTotal,
			String coverArt, String bpm, String lyrics, String isCompilation, String encoder, String isrc,
			String barcode, String catalogueNumber, String amazonId, String musicBrainzArtistId,
			String musicBrainzDiscId, String musicBrainzReleaseCountry, String musicBrainzReleaseStatus,
			String musicBrainzReleaseType, String musicBrainzReleaseArtistId, String musicBrainzReleaseId,
			String musicBrainzTrackId, String musicIpId, String titleSort, String artistSort, String albumSort,
			String albumArtistSort, String composerSort, String urlDiscogsArtistSite, String urlDiscogsReleaseSite,
			String urlLyricsSite, String urlOfficialArtistSite, String urlOfficialReleaseSite,
			String urlWikipediaReleaseSite, String urlWikipediaArtistSite) {
		this.audioId = audioId;
		this.libraryId = libraryId;
		this.fileName = fileName;
		this.filePath = filePath;
		this.artist = artist;
		this.title = title;
		this.track = track;
		this.trackTotal = trackTotal;
		this.genre = genre;
		this.album = album;
		this.albumArtist = albumArtist;
		this.composer = composer;
		this.year = year;
		this.recordLabel = recordLabel;
		this.lyrcist = lyrcist;
		this.language = language;
		this.key = key;
		this.conductor = conductor;
		this.remixer = remixer;
		this.mood = mood;
		this.media = media;
		this.comment = comment;
		this.grouping = grouping;
		this.discNumber = discNumber;
		this.discTotal = discTotal;
		this.coverArt = coverArt;
		this.bpm = bpm;
		this.lyrics = lyrics;
		this.isCompilation = isCompilation;
		this.encoder = encoder;
		this.isrc = isrc;
		this.barcode = barcode;
		this.catalogueNumber = catalogueNumber;
		this.amazonId = amazonId;
		this.musicBrainzArtistId = musicBrainzArtistId;
		this.musicBrainzDiscId = musicBrainzDiscId;
		this.musicBrainzReleaseCountry = musicBrainzReleaseCountry;
		this.musicBrainzReleaseStatus = musicBrainzReleaseStatus;
		this.musicBrainzReleaseType = musicBrainzReleaseType;
		this.musicBrainzReleaseArtistId = musicBrainzReleaseArtistId;
		this.musicBrainzReleaseId = musicBrainzReleaseId;
		this.musicBrainzTrackId = musicBrainzTrackId;
		this.musicIpId = musicIpId;
		this.titleSort = titleSort;
		this.artistSort = artistSort;
		this.albumSort = albumSort;
		this.albumArtistSort = albumArtistSort;
		this.composerSort = composerSort;
		this.urlDiscogsArtistSite = urlDiscogsArtistSite;
		this.urlDiscogsReleaseSite = urlDiscogsReleaseSite;
		this.urlLyricsSite = urlLyricsSite;
		this.urlOfficialArtistSite = urlOfficialArtistSite;
		this.urlOfficialReleaseSite = urlOfficialReleaseSite;
		this.urlWikipediaReleaseSite = urlWikipediaReleaseSite;
		this.urlWikipediaArtistSite = urlWikipediaArtistSite;
	}
	public LibraryAudio() {
	}
}
