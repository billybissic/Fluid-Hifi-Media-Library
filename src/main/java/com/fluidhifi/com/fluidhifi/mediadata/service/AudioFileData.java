/**
 * 
 */
package com.fluidhifi.com.fluidhifi.mediadata.service;

import java.io.File;
import java.io.IOException;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.flac.FlacTag;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import org.jaudiotagger.tag.id3.ID3v1Tag;
import org.jaudiotagger.tag.id3.ID3v24Frames;
import org.jaudiotagger.tag.mp4.Mp4FieldKey;
import org.jaudiotagger.tag.mp4.Mp4Tag;
import org.jaudiotagger.tag.mp4.field.Mp4DiscNoField;
import org.jaudiotagger.tag.mp4.field.Mp4TrackField;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;

/**
 * @author lahjeq taylor
 *
 */
public class AudioFileData {

	private String artist;
	private String title;
	private String track;
	private String trackTotal;
	private String genre;
	private String album;
	private String albumArtist;
	private String composer;
	private String year;
	private String recordLabel;
	private String lyrcist;
	private String language;
	private String key;
	private String conductor;
	private String remixer;
	private String mood;
	private String media;
	private String comment;
	private String grouping;
	private String discNumber;
	private String discTotal;
	private String coverArt;
	private String bpm;
	private String lyrics;
	private String isCompilation;
	private String encoder;
	private String isrc;
	private String barcode;
	private String catalogueNumber;
	private String amazonId;
	private String musicBrainzArtistId;
	private String musicBrainzDiscId;
	private String musicBrainzReleaseCountry;
	private String musicBrainzReleaseStatus;
	private String musicBrainzReleaseType;
	private String musicBrainzReleaseArtistId;
	private String musicBrainzReleaseId;
	private String musicBrainzTrackId;
	private String musicIpId;

	/* sorts */
	private String titleSort;
	private String artistSort;
	private String albumSort;
	private String albumArtistSort;
	private String composerSort;

	/* urls */
	private String urlDiscogsArtistSite;
	private String urlDiscogsReleaseSite;
	private String urlLyricsSite;
	private String urlOfficialArtistSite;
	private String urlOfficialReleaseSite;
	private String urlWikipediaReleaseSite;
	private String urlWikipediaArtistSite;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getTrackTotal() {
		return trackTotal;
	}

	public void setTrackTotal(String trackTotal) {
		this.trackTotal = trackTotal;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbumArtist() {
		return albumArtist;
	}

	public void setAlbumArtist(String albumArtist) {
		this.albumArtist = albumArtist;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public void setRecordLabel(String recordLabel) {
		this.recordLabel = recordLabel;
	}

	public String getLyrcist() {
		return lyrcist;
	}

	public void setLyrcist(String lyrcist) {
		this.lyrcist = lyrcist;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getRemixer() {
		return remixer;
	}

	public void setRemixer(String remixer) {
		this.remixer = remixer;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getGrouping() {
		return grouping;
	}

	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}

	public String getDiscNumber() {
		return discNumber;
	}

	public void setDiscNumber(String discNumber) {
		this.discNumber = discNumber;
	}

	public String getCoverArt() {
		return coverArt;
	}

	public String getDiscTotal() {
		return discTotal;
	}

	public void setDiscTotal(String discTotal) {
		this.discTotal = discTotal;
	}

	public void setCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}

	public String getBpm() {
		return bpm;
	}

	public void setBpm(String bpm) {
		this.bpm = bpm;
	}

	public String getLyrics() {
		return lyrics;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public String isCompilation() {
		return isCompilation;
	}

	public void setCompilation(String isCompilation) {
		this.isCompilation = isCompilation;
	}

	public String getEncoder() {
		return encoder;
	}

	public void setEncoder(String encoder) {
		this.encoder = encoder;
	}

	public String getIsrc() {
		return isrc;
	}

	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCatalogueNumber() {
		return catalogueNumber;
	}

	public void setCatalogueNumber(String catalogueNumber) {
		this.catalogueNumber = catalogueNumber;
	}

	public String getAmazonId() {
		return amazonId;
	}

	public void setAmazonId(String amazonId) {
		this.amazonId = amazonId;
	}

	public String getTitleSort() {
		return titleSort;
	}

	public void setTitleSort(String titleSort) {
		this.titleSort = titleSort;
	}

	public String getArtistSort() {
		return artistSort;
	}

	public void setArtistSort(String artistSort) {
		this.artistSort = artistSort;
	}

	public String getAlbumSort() {
		return albumSort;
	}

	public void setAlbumSort(String albumSort) {
		this.albumSort = albumSort;
	}

	public String getAlbumArtistSort() {
		return albumArtistSort;
	}

	public void setAlbumArtistSort(String albumArtistSort) {
		this.albumArtistSort = albumArtistSort;
	}

	public String getComposerSort() {
		return composerSort;
	}

	public void setComposerSort(String composerSort) {
		this.composerSort = composerSort;
	}

	public String getUrlDiscogsArtistSite() {
		return urlDiscogsArtistSite;
	}

	public void setUrlDiscogsArtistSite(String urlDiscogsArtistSite) {
		this.urlDiscogsArtistSite = urlDiscogsArtistSite;
	}

	public String getUrlDiscogsReleaseSite() {
		return urlDiscogsReleaseSite;
	}

	public void setUrlDiscogsReleaseSite(String urlDiscogsReleaseSite) {
		this.urlDiscogsReleaseSite = urlDiscogsReleaseSite;
	}

	public String getUrlLyricsSite() {
		return urlLyricsSite;
	}

	public void setUrlLyricsSite(String urlLyricsSite) {
		this.urlLyricsSite = urlLyricsSite;
	}

	public String getUrlOfficialArtistSite() {
		return urlOfficialArtistSite;
	}

	public void setUrlOfficialArtistSite(String urlOfficialArtistSite) {
		this.urlOfficialArtistSite = urlOfficialArtistSite;
	}

	public String getUrlWikipediaReleaseSite() {
		return urlWikipediaReleaseSite;
	}

	public void setUrlWikipediaReleaseSite(String urlWikipediaReleaseSite) {
		this.urlWikipediaReleaseSite = urlWikipediaReleaseSite;
	}

	public AudioFileData(String artist, String title, String track, String trackTotal, String genre, String album,
			String albumArtist, String composer, String year, String recordLabel, String lyrcist, String language,
			String key, String conductor, String remixer, String mood, String media, String comment, String grouping,
			String discNumber, String coverArt, String bpm, String lyrics, String isCompilation, String encoder,
			String isrc, String barcode, String catalogueNumber, String amazonId, String titleSort, String artistSort,
			String albumSort, String albumArtistSort, String composerSort, String urlDiscogsArtistSite,
			String urlDiscogsReleaseSite, String urlLyricsSite, String urlOfficialArtistSite,
			String urlWikipediaReleaseSite) {
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
		this.coverArt = coverArt;
		this.bpm = bpm;
		this.lyrics = lyrics;
		this.isCompilation = isCompilation;
		this.encoder = encoder;
		this.isrc = isrc;
		this.barcode = barcode;
		this.catalogueNumber = catalogueNumber;
		this.amazonId = amazonId;
		this.titleSort = titleSort;
		this.artistSort = artistSort;
		this.albumSort = albumSort;
		this.albumArtistSort = albumArtistSort;
		this.composerSort = composerSort;
		this.urlDiscogsArtistSite = urlDiscogsArtistSite;
		this.urlDiscogsReleaseSite = urlDiscogsReleaseSite;
		this.urlLyricsSite = urlLyricsSite;
		this.urlOfficialArtistSite = urlOfficialArtistSite;
		this.urlWikipediaReleaseSite = urlWikipediaReleaseSite;
	}

	public AudioFileData() {
	}

	public void ExtractOggAudioData(File fileToExtractDataFrom)
			throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		AudioFile f = AudioFileIO.read(fileToExtractDataFrom);
		VorbisCommentTag tag = (VorbisCommentTag) f.getTag();

		this.album = tag.getFirst(FieldKey.ALBUM);
		this.albumArtist = tag.getFirst(FieldKey.ALBUM_ARTIST);
		this.albumArtistSort = tag.getFirst(FieldKey.ALBUM_ARTIST_SORT);
		this.albumSort = tag.getFirst(FieldKey.ALBUM_SORT);
		this.amazonId = tag.getFirst(FieldKey.AMAZON_ID);
		this.artist = tag.getFirst(FieldKey.ARTIST);
		this.artistSort = tag.getFirst(FieldKey.ARTIST_SORT);
		this.barcode = tag.getFirst(FieldKey.BARCODE);
		this.bpm = tag.getFirst(FieldKey.BPM);
		this.catalogueNumber = tag.getFirst(FieldKey.CATALOG_NO);
		this.comment = tag.getFirst(FieldKey.COMMENT);
		this.composer = tag.getFirst(FieldKey.COMPOSER);
		this.composerSort = tag.getFirst(FieldKey.COMPOSER_SORT);
		this.conductor = tag.getFirst(FieldKey.CONDUCTOR);
		this.coverArt = tag.getFirst(FieldKey.COVER_ART);
		this.discNumber = tag.getFirst(FieldKey.DISC_NO);
		this.discTotal = tag.getFirst(FieldKey.DISC_TOTAL);
		this.encoder = tag.getFirst(FieldKey.ENCODER);
		this.genre = tag.getFirst(FieldKey.GENRE);
		this.grouping = tag.getFirst(FieldKey.GROUPING);
		this.isCompilation = tag.getFirst(FieldKey.IS_COMPILATION);
		this.isrc = tag.getFirst(FieldKey.ISRC);
		this.key = tag.getFirst(FieldKey.KEY);
		this.language = tag.getFirst(FieldKey.LANGUAGE);
		this.lyrcist = tag.getFirst(FieldKey.LYRICIST);
		this.lyrics = tag.getFirst(FieldKey.LYRICS);
		this.media = tag.getFirst(FieldKey.MEDIA);
		this.mood = tag.getFirst(FieldKey.MOOD);
		this.musicBrainzArtistId = tag.getFirst(FieldKey.MUSICBRAINZ_ARTISTID);
		this.musicBrainzDiscId = tag.getFirst(FieldKey.MUSICBRAINZ_DISC_ID);
		this.musicBrainzReleaseCountry = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
		this.musicBrainzReleaseStatus = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_STATUS);
		this.musicBrainzReleaseType = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_TYPE);
		this.musicBrainzReleaseArtistId = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEARTISTID);
		this.musicBrainzReleaseId = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEID);
		this.musicBrainzTrackId = tag.getFirst(FieldKey.MUSICBRAINZ_TRACK_ID);
		this.musicIpId = tag.getFirst(FieldKey.MUSICIP_ID);
		this.recordLabel = tag.getFirst(FieldKey.RECORD_LABEL);
		this.remixer = tag.getFirst(FieldKey.REMIXER);
		this.title = tag.getFirst(FieldKey.TITLE);
		this.titleSort = tag.getFirst(FieldKey.TITLE_SORT);
		this.track = tag.getFirst(FieldKey.TRACK);
		this.trackTotal = tag.getFirst(FieldKey.TRACK_TOTAL);
		this.urlDiscogsArtistSite = tag.getFirst(FieldKey.URL_DISCOGS_ARTIST_SITE);
		this.urlDiscogsReleaseSite = tag.getFirst(FieldKey.URL_DISCOGS_RELEASE_SITE);
		this.urlLyricsSite = tag.getFirst(FieldKey.URL_LYRICS_SITE);
		this.urlOfficialArtistSite = tag.getFirst(FieldKey.URL_OFFICIAL_ARTIST_SITE);
		this.urlOfficialReleaseSite = tag.getFirst(FieldKey.URL_OFFICIAL_RELEASE_SITE);
		this.urlWikipediaArtistSite = tag.getFirst(FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
		this.urlWikipediaReleaseSite = tag.getFirst(FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
		this.year = tag.getFirst(FieldKey.YEAR);
	}

	public void ExtractFlacAudioData(File fileToExtractDataFrom)
			throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		AudioFile f = AudioFileIO.read(fileToExtractDataFrom);
		FlacTag tag = (FlacTag) f.getTag();

		this.album = tag.getFirst(FieldKey.ALBUM);
		this.albumArtist = tag.getFirst(FieldKey.ALBUM_ARTIST);
		this.albumArtistSort = tag.getFirst(FieldKey.ALBUM_ARTIST_SORT);
		this.albumSort = tag.getFirst(FieldKey.ALBUM_SORT);
		this.amazonId = tag.getFirst(FieldKey.AMAZON_ID);
		this.artist = tag.getFirst(FieldKey.ARTIST);
		this.artistSort = tag.getFirst(FieldKey.ARTIST_SORT);
		this.barcode = tag.getFirst(FieldKey.BARCODE);
		this.bpm = tag.getFirst(FieldKey.BPM);
		this.catalogueNumber = tag.getFirst(FieldKey.CATALOG_NO);
		this.comment = tag.getFirst(FieldKey.COMMENT);
		this.composer = tag.getFirst(FieldKey.COMPOSER);
		this.composerSort = tag.getFirst(FieldKey.COMPOSER_SORT);
		this.conductor = tag.getFirst(FieldKey.CONDUCTOR);
		this.coverArt = tag.getFirst(FieldKey.COVER_ART);
		this.discNumber = tag.getFirst(FieldKey.DISC_NO);
		this.discTotal = tag.getFirst(FieldKey.DISC_TOTAL);
		this.encoder = tag.getFirst(FieldKey.ENCODER);
		this.genre = tag.getFirst(FieldKey.GENRE);
		this.grouping = tag.getFirst(FieldKey.GROUPING);
		this.isCompilation = tag.getFirst(FieldKey.IS_COMPILATION);
		this.isrc = tag.getFirst(FieldKey.ISRC);
		this.key = tag.getFirst(FieldKey.KEY);
		this.language = tag.getFirst(FieldKey.LANGUAGE);
		this.lyrcist = tag.getFirst(FieldKey.LYRICIST);
		this.lyrics = tag.getFirst(FieldKey.LYRICS);
		this.media = tag.getFirst(FieldKey.MEDIA);
		this.mood = tag.getFirst(FieldKey.MOOD);
		this.musicBrainzArtistId = tag.getFirst(FieldKey.MUSICBRAINZ_ARTISTID);
		this.musicBrainzDiscId = tag.getFirst(FieldKey.MUSICBRAINZ_DISC_ID);
		this.musicBrainzReleaseCountry = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
		this.musicBrainzReleaseStatus = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_STATUS);
		this.musicBrainzReleaseType = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_TYPE);
		this.musicBrainzReleaseArtistId = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEARTISTID);
		this.musicBrainzReleaseId = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEID);
		this.musicBrainzTrackId = tag.getFirst(FieldKey.MUSICBRAINZ_TRACK_ID);
		this.musicIpId = tag.getFirst(FieldKey.MUSICIP_ID);
		this.recordLabel = tag.getFirst(FieldKey.RECORD_LABEL);
		this.remixer = tag.getFirst(FieldKey.REMIXER);
		this.title = tag.getFirst(FieldKey.TITLE);
		this.titleSort = tag.getFirst(FieldKey.TITLE_SORT);
		this.track = tag.getFirst(FieldKey.TRACK);
		this.trackTotal = tag.getFirst(FieldKey.TRACK_TOTAL);
		this.urlDiscogsArtistSite = tag.getFirst(FieldKey.URL_DISCOGS_ARTIST_SITE);
		this.urlDiscogsReleaseSite = tag.getFirst(FieldKey.URL_DISCOGS_RELEASE_SITE);
		this.urlLyricsSite = tag.getFirst(FieldKey.URL_LYRICS_SITE);
		this.urlOfficialArtistSite = tag.getFirst(FieldKey.URL_OFFICIAL_ARTIST_SITE);
		this.urlOfficialReleaseSite = tag.getFirst(FieldKey.URL_OFFICIAL_RELEASE_SITE);
		this.urlWikipediaArtistSite = tag.getFirst(FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
		this.urlWikipediaReleaseSite = tag.getFirst(FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
		this.year = tag.getFirst(FieldKey.YEAR);
	}

	public void ExtractMP3AudioData(File fileToExtractDataFrom)
			throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		AudioFile f = AudioFileIO.read(fileToExtractDataFrom);
		MP3File tag = (MP3File) f.getTag();

		if (tag.hasID3v2Tag()) {
			AbstractID3v2Tag v2tag = (AbstractID3v2Tag) f.getTag();

			this.album = v2tag.getFirst(ID3v24Frames.FRAME_ID_ALBUM);
			this.albumArtist = v2tag.getFirst(ID3v24Frames.FRAME_ID_ALBUM_ARTIST_SORT_ORDER_ITUNES);
			this.albumArtistSort = v2tag.getFirst(ID3v24Frames.ALBUM_ARTIST_SORT);
			this.albumSort = v2tag.getFirst(ID3v24Frames.ALBUM_SORT);
			this.amazonId = v2tag.getFirst(ID3v24Frames.AMAZON_ID);
			this.artist = v2tag.getFirst(ID3v24Frames.ARTIST);
			this.artistSort = v2tag.getFirst(ID3v24Frames.ARTIST_SORT);
			this.barcode = v2tag.getFirst(ID3v24Frames.BARCODE);
			this.bpm = v2tag.getFirst(ID3v24Frames.BPM);
			this.catalogueNumber = v2tag.getFirst(ID3v24Frames.CATALOG_NO);
			this.comment = v2tag.getFirst(ID3v24Frames.COMMENT);
			this.composer = v2tag.getFirst(ID3v24Frames.COMPOSER);
			this.composerSort = v2tag.getFirst(ID3v24Frames.COMPOSER_SORT);
			this.conductor = v2tag.getFirst(ID3v24Frames.CONDUCTOR);
			this.coverArt = v2tag.getFirst(ID3v24Frames.COVER_ART);
			this.discNumber = v2tag.getFirst(ID3v24Frames.DISC_NO);
			this.discTotal = v2tag.getFirst(ID3v24Frames.DISC_TOTAL);
			this.encoder = v2tag.getFirst(ID3v24Frames.ENCODER);
			this.genre = v2tag.getFirst(ID3v24Frames.GENRE);
			this.grouping = v2tag.getFirst(ID3v24Frames.GROUPING);
			this.isCompilation = v2tag.getFirst(ID3v24Frames.IS_COMPILATION);
			this.isrc = v2tag.getFirst(ID3v24Frames.ISRC);
			this.key = v2tag.getFirst(ID3v24Frames.KEY);
			this.language = v2tag.getFirst(ID3v24Frames.LANGUAGE);
			this.lyrcist = v2tag.getFirst(ID3v24Frames.LYRICIST);
			this.lyrics = v2tag.getFirst(ID3v24Frames.LYRICS);
			this.media = v2tag.getFirst(ID3v24Frames.MEDIA);
			this.mood = v2tag.getFirst(ID3v24Frames.MOOD);
			this.musicBrainzArtistId = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_ARTISTID);
			this.musicBrainzDiscId = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_DISC_ID);
			this.musicBrainzReleaseCountry = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_RELEASE_COUNTRY);
			this.musicBrainzReleaseStatus = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_RELEASE_STATUS);
			this.musicBrainzReleaseType = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_RELEASE_TYPE);
			this.musicBrainzReleaseArtistId = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_RELEASEARTISTID);
			this.musicBrainzReleaseId = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_RELEASEID);
			this.musicBrainzTrackId = v2tag.getFirst(ID3v24Frames.MUSICBRAINZ_TRACK_ID);
			this.musicIpId = v2tag.getFirst(ID3v24Frames.MUSICIP_ID);
			this.recordLabel = v2tag.getFirst(ID3v24Frames.RECORD_LABEL);
			this.remixer = v2tag.getFirst(ID3v24Frames.REMIXER);
			this.title = v2tag.getFirst(ID3v24Frames.TITLE);
			this.titleSort = v2tag.getFirst(ID3v24Frames.TITLE_SORT);
			this.track = v2tag.getFirst(ID3v24Frames.TRACK);
			this.trackTotal = v2tag.getFirst(ID3v24Frames.TRACK_TOTAL);
			this.urlDiscogsArtistSite = v2tag.getFirst(ID3v24Frames.URL_DISCOGS_ARTIST_SITE);
			this.urlDiscogsReleaseSite = v2tag.getFirst(ID3v24Frames.URL_DISCOGS_RELEASE_SITE);
			this.urlLyricsSite = v2tag.getFirst(ID3v24Frames.URL_LYRICS_SITE);
			this.urlOfficialArtistSite = v2tag.getFirst(ID3v24Frames.URL_OFFICIAL_ARTIST_SITE);
			this.urlOfficialReleaseSite = v2tag.getFirst(ID3v24Frames.URL_OFFICIAL_RELEASE_SITE);
			this.urlWikipediaArtistSite = v2tag.getFirst(ID3v24Frames.URL_WIKIPEDIA_ARTIST_SITE);
			this.urlWikipediaReleaseSite = v2tag.getFirst(ID3v24Frames.URL_WIKIPEDIA_RELEASE_SITE);
			this.year = v2tag.getFirst(ID3v24Frames.YEAR);

			return;
		}

		if (tag.hasID3v1Tag()) {
			ID3v1Tag v1Tag = (ID3v1Tag)f.getTag();

			this.album = v1Tag.getFirst(FieldKey.ALBUM);
			this.albumArtist = v1Tag.getFirst(FieldKey.ALBUM_ARTIST);
			this.albumArtistSort = v1Tag.getFirst(FieldKey.ALBUM_ARTIST_SORT);
			this.albumSort = v1Tag.getFirst(FieldKey.ALBUM_SORT);
			this.amazonId = v1Tag.getFirst(FieldKey.AMAZON_ID);
			this.artist = v1Tag.getFirst(FieldKey.ARTIST);
			this.artistSort = v1Tag.getFirst(FieldKey.ARTIST_SORT);
			this.barcode = v1Tag.getFirst(FieldKey.BARCODE);
			this.bpm = v1Tag.getFirst(FieldKey.BPM);
			this.catalogueNumber = v1Tag.getFirst(FieldKey.CATALOG_NO);
			this.comment = v1Tag.getFirst(FieldKey.COMMENT);
			this.composer = v1Tag.getFirst(FieldKey.COMPOSER);
			this.composerSort = v1Tag.getFirst(FieldKey.COMPOSER_SORT);
			this.conductor = v1Tag.getFirst(FieldKey.CONDUCTOR);
			this.coverArt = v1Tag.getFirst(FieldKey.COVER_ART);
			this.discNumber = v1Tag.getFirst(FieldKey.DISC_NO);
			this.discTotal = v1Tag.getFirst(FieldKey.DISC_TOTAL);
			this.encoder = v1Tag.getFirst(FieldKey.ENCODER);
			this.genre = v1Tag.getFirst(FieldKey.GENRE);
			this.grouping = v1Tag.getFirst(FieldKey.GROUPING);
			this.isCompilation = v1Tag.getFirst(FieldKey.IS_COMPILATION);
			this.isrc = v1Tag.getFirst(FieldKey.ISRC);
			this.key = v1Tag.getFirst(FieldKey.KEY);
			this.language = v1Tag.getFirst(FieldKey.LANGUAGE);
			this.lyrcist = v1Tag.getFirst(FieldKey.LYRICIST);
			this.lyrics = v1Tag.getFirst(FieldKey.LYRICS);
			this.media = v1Tag.getFirst(FieldKey.MEDIA);
			this.mood = v1Tag.getFirst(FieldKey.MOOD);
			this.musicBrainzArtistId = v1Tag.getFirst(FieldKey.MUSICBRAINZ_ARTISTID);
			this.musicBrainzDiscId = v1Tag.getFirst(FieldKey.MUSICBRAINZ_DISC_ID);
			this.musicBrainzReleaseCountry = v1Tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
			this.musicBrainzReleaseStatus = v1Tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_STATUS);
			this.musicBrainzReleaseType = v1Tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_TYPE);
			this.musicBrainzReleaseArtistId = v1Tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEARTISTID);
			this.musicBrainzReleaseId = v1Tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEID);
			this.musicBrainzTrackId = v1Tag.getFirst(FieldKey.MUSICBRAINZ_TRACK_ID);
			this.musicIpId = v1Tag.getFirst(FieldKey.MUSICIP_ID);
			this.recordLabel = v1Tag.getFirst(FieldKey.RECORD_LABEL);
			this.remixer = v1Tag.getFirst(FieldKey.REMIXER);
			this.title = v1Tag.getFirst(FieldKey.TITLE);
			this.titleSort = v1Tag.getFirst(FieldKey.TITLE_SORT);
			this.track = v1Tag.getFirst(FieldKey.TRACK);
			this.trackTotal = v1Tag.getFirst(FieldKey.TRACK_TOTAL);
			this.urlDiscogsArtistSite = v1Tag.getFirst(FieldKey.URL_DISCOGS_ARTIST_SITE);
			this.urlDiscogsReleaseSite = v1Tag.getFirst(FieldKey.URL_DISCOGS_RELEASE_SITE);
			this.urlLyricsSite = v1Tag.getFirst(FieldKey.URL_LYRICS_SITE);
			this.urlOfficialArtistSite = v1Tag.getFirst(FieldKey.URL_OFFICIAL_ARTIST_SITE);
			this.urlOfficialReleaseSite = v1Tag.getFirst(FieldKey.URL_OFFICIAL_RELEASE_SITE);
			this.urlWikipediaArtistSite = v1Tag.getFirst(FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
			this.urlWikipediaReleaseSite = v1Tag.getFirst(FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
			this.year = v1Tag.getFirst(FieldKey.YEAR);

			return;
		}
	}

	public void ExtractMP4AudioData(File fileToExtractDataFrom)
			throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		AudioFile f = AudioFileIO.read(fileToExtractDataFrom);
		Mp4Tag tag = (Mp4Tag) f.getTag();

		this.album = tag.getFirst(Mp4FieldKey.ALBUM);
		this.albumArtist = tag.getFirst(Mp4FieldKey.ALBUM_ARTIST);
		this.albumArtistSort = tag.getFirst(Mp4FieldKey.ALBUM_ARTIST_SORT);
		this.albumSort = tag.getFirst(Mp4FieldKey.ALBUM_SORT);
		this.amazonId = tag.getFirst(Mp4FieldKey.ASIN);
		this.artist = tag.getFirst(Mp4FieldKey.ARTIST);
		this.artistSort = tag.getFirst(Mp4FieldKey.ARTIST_SORT);
		this.barcode = tag.getFirst(Mp4FieldKey.BARCODE);
		this.bpm = tag.getFirst(Mp4FieldKey.BPM);
		this.catalogueNumber = tag.getFirst(Mp4FieldKey.CATALOGNO);
		this.comment = tag.getFirst(Mp4FieldKey.COMMENT);
		this.composer = tag.getFirst(Mp4FieldKey.COMPOSER);
		this.composerSort = tag.getFirst(Mp4FieldKey.COMPOSER_SORT);
		this.conductor = tag.getFirst(Mp4FieldKey.CONDUCTOR);
		this.coverArt = tag.getFirst(Mp4FieldKey.ARTWORK);
		this.discNumber = tag.getFirst(Mp4FieldKey.DISCNUMBER);
		/* TODO: find out how to replace this */
		short disctotal = ((Mp4DiscNoField) tag.getFirstField(Mp4FieldKey.DISCNUMBER)).getDiscTotal();
		this.discTotal = String.valueOf(disctotal);
		this.encoder = tag.getFirst(Mp4FieldKey.ENCODER);
		this.genre = tag.getFirst(Mp4FieldKey.GENRE);
		this.grouping = tag.getFirst(Mp4FieldKey.GROUPING);
		this.isCompilation = tag.getFirst(Mp4FieldKey.COMPILATION);
		this.isrc = tag.getFirst(Mp4FieldKey.ISRC);
		this.key = tag.getFirst(Mp4FieldKey.KEY);
		this.language = tag.getFirst(Mp4FieldKey.LANGUAGE);
		this.lyrcist = tag.getFirst(Mp4FieldKey.LYRICIST);
		this.lyrics = tag.getFirst(Mp4FieldKey.LYRICS);
		this.media = tag.getFirst(Mp4FieldKey.MEDIA);
		this.mood = tag.getFirst(Mp4FieldKey.MOOD);
		this.musicBrainzArtistId = tag.getFirst(Mp4FieldKey.MUSICBRAINZ_ARTISTID);
		this.musicBrainzDiscId = tag.getFirst(Mp4FieldKey.MUSICBRAINZ_DISCID);
		/* TODO: find out how to replace this or if it should be removed */
		// this.musicBrainzReleaseCountry = tag.getFirst(Mp4FieldKey.music);
		// this.musicBrainzReleaseStatus =
		// tag.getFirst(Mp4FieldKey.MUSICBRAINZ_RELEASE_STATUS);
		// this.musicBrainzReleaseType =
		// tag.getFirst(Mp4FieldKey.MUSICBRAINZ_RELEASE_TYPE);
		this.musicBrainzReleaseArtistId = tag.getFirst(Mp4FieldKey.MUSICBRAINZ_ARTISTID);
		this.musicBrainzReleaseId = tag.getFirst(Mp4FieldKey.MUSICBRAINZ_ALBUMID);
		this.musicBrainzTrackId = tag.getFirst(Mp4FieldKey.MUSICBRAINZ_TRACKID);
		// this.musicIpId = tag.getFirst(Mp4FieldKey.MUSICIP_ID);
		this.recordLabel = tag.getFirst(Mp4FieldKey.LABEL);
		this.remixer = tag.getFirst(Mp4FieldKey.REMIXER);
		this.title = tag.getFirst(Mp4FieldKey.TITLE);
		this.titleSort = tag.getFirst(Mp4FieldKey.TITLE_SORT);
		this.track = tag.getFirst(Mp4FieldKey.TRACK);
		short trackTotal = ((Mp4TrackField) tag.getFirstField(Mp4FieldKey.TRACK)).getTrackTotal();
		this.trackTotal = String.valueOf(trackTotal);
		this.urlDiscogsArtistSite = tag.getFirst(Mp4FieldKey.URL_DISCOGS_ARTIST_SITE);
		this.urlDiscogsReleaseSite = tag.getFirst(Mp4FieldKey.URL_DISCOGS_RELEASE_SITE);
		this.urlLyricsSite = tag.getFirst(Mp4FieldKey.URL_LYRICS_SITE);
		this.urlOfficialArtistSite = tag.getFirst(Mp4FieldKey.URL_OFFICIAL_ARTIST_SITE);
		this.urlOfficialReleaseSite = tag.getFirst(Mp4FieldKey.URL_OFFICIAL_RELEASE_SITE);
		this.urlWikipediaArtistSite = tag.getFirst(Mp4FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
		this.urlWikipediaReleaseSite = tag.getFirst(Mp4FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
		this.year = tag.getFirst(Mp4FieldKey.DAY);
	}

	public void ExtractAudioData(File fileToExtractDataFrom) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		if (fileToExtractDataFrom.getName().toUpperCase().contains(".FLAC")) {

			System.out.println("Flac file found. Extracting using ExtractFlacAudioData() method.");
			ExtractFlacAudioData(fileToExtractDataFrom);
		}
		if (fileToExtractDataFrom.getName().toUpperCase().contains(".MP4")) {
			System.out.println("Mp4 file found. Extracting using ExtractMP4AudioData() method.");
			ExtractMP4AudioData(fileToExtractDataFrom);
		}
		if (fileToExtractDataFrom.getName().toUpperCase().contains(".MP3")) {
			ExtractMP3AudioData(fileToExtractDataFrom);
		}
		if (fileToExtractDataFrom.getName().toUpperCase().contains(".OGG")) {
			System.out.println("Ogg file found. Extracting using ExtractOggAudioData() method.");
			ExtractOggAudioData(fileToExtractDataFrom);
		}
	}

	public void ExtractGenericAudioData(File fileToExtractDataFrom)
			throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {

		AudioFile f = AudioFileIO.read(fileToExtractDataFrom);
		Tag tag = f.getTag();

		this.album = tag.getFirst(FieldKey.ALBUM);
		this.albumArtist = tag.getFirst(FieldKey.ALBUM_ARTIST);
		this.albumArtistSort = tag.getFirst(FieldKey.ALBUM_ARTIST_SORT);
		this.albumSort = tag.getFirst(FieldKey.ALBUM_SORT);
		this.amazonId = tag.getFirst(FieldKey.AMAZON_ID);
		this.artist = tag.getFirst(FieldKey.ARTIST);
		this.artistSort = tag.getFirst(FieldKey.ARTIST_SORT);
		this.barcode = tag.getFirst(FieldKey.BARCODE);
		this.bpm = tag.getFirst(FieldKey.BPM);
		this.catalogueNumber = tag.getFirst(FieldKey.CATALOG_NO);
		this.comment = tag.getFirst(FieldKey.COMMENT);
		this.composer = tag.getFirst(FieldKey.COMPOSER);
		this.composerSort = tag.getFirst(FieldKey.COMPOSER_SORT);
		this.conductor = tag.getFirst(FieldKey.CONDUCTOR);
		this.coverArt = tag.getFirst(FieldKey.COVER_ART);
		this.discNumber = tag.getFirst(FieldKey.DISC_NO);
		this.discTotal = tag.getFirst(FieldKey.DISC_TOTAL);
		this.encoder = tag.getFirst(FieldKey.ENCODER);
		this.genre = tag.getFirst(FieldKey.GENRE);
		this.grouping = tag.getFirst(FieldKey.GROUPING);
		this.isCompilation = tag.getFirst(FieldKey.IS_COMPILATION);
		this.isrc = tag.getFirst(FieldKey.ISRC);
		this.key = tag.getFirst(FieldKey.KEY);
		this.language = tag.getFirst(FieldKey.LANGUAGE);
		this.lyrcist = tag.getFirst(FieldKey.LYRICIST);
		this.lyrics = tag.getFirst(FieldKey.LYRICS);
		this.media = tag.getFirst(FieldKey.MEDIA);
		this.mood = tag.getFirst(FieldKey.MOOD);
		this.musicBrainzArtistId = tag.getFirst(FieldKey.MUSICBRAINZ_ARTISTID);
		this.musicBrainzDiscId = tag.getFirst(FieldKey.MUSICBRAINZ_DISC_ID);
		this.musicBrainzReleaseCountry = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
		this.musicBrainzReleaseStatus = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_STATUS);
		this.musicBrainzReleaseType = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASE_TYPE);
		this.musicBrainzReleaseArtistId = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEARTISTID);
		this.musicBrainzReleaseId = tag.getFirst(FieldKey.MUSICBRAINZ_RELEASEID);
		this.musicBrainzTrackId = tag.getFirst(FieldKey.MUSICBRAINZ_TRACK_ID);
		this.musicIpId = tag.getFirst(FieldKey.MUSICIP_ID);
		this.recordLabel = tag.getFirst(FieldKey.RECORD_LABEL);
		this.remixer = tag.getFirst(FieldKey.REMIXER);
		this.title = tag.getFirst(FieldKey.TITLE);
		this.titleSort = tag.getFirst(FieldKey.TITLE_SORT);
		this.track = tag.getFirst(FieldKey.TRACK);
		this.trackTotal = tag.getFirst(FieldKey.TRACK_TOTAL);
		this.urlDiscogsArtistSite = tag.getFirst(FieldKey.URL_DISCOGS_ARTIST_SITE);
		this.urlDiscogsReleaseSite = tag.getFirst(FieldKey.URL_DISCOGS_RELEASE_SITE);
		this.urlLyricsSite = tag.getFirst(FieldKey.URL_LYRICS_SITE);
		this.urlOfficialArtistSite = tag.getFirst(FieldKey.URL_OFFICIAL_ARTIST_SITE);
		this.urlOfficialReleaseSite = tag.getFirst(FieldKey.URL_OFFICIAL_RELEASE_SITE);
		this.urlWikipediaArtistSite = tag.getFirst(FieldKey.URL_WIKIPEDIA_ARTIST_SITE);
		this.urlWikipediaReleaseSite = tag.getFirst(FieldKey.URL_WIKIPEDIA_RELEASE_SITE);
		this.year = tag.getFirst(FieldKey.YEAR);
	}

	@Override
	public String toString() {
		return "AudioFileData [artist=" + artist + ", title=" + title + ", track=" + track + ", trackTotal="
				+ trackTotal + ", genre=" + genre + ", album=" + album + ", albumArtist=" + albumArtist + ", composer="
				+ composer + ", year=" + year + ", recordLabel=" + recordLabel + ", lyrcist=" + lyrcist + ", language="
				+ language + ", key=" + key + ", conductor=" + conductor + ", remixer=" + remixer + ", mood=" + mood
				+ ", media=" + media + ", comment=" + comment + ", grouping=" + grouping + ", discNumber=" + discNumber
				+ ", discTotal=" + discTotal + ", coverArt=" + coverArt + ", bpm=" + bpm + ", lyrics=" + lyrics
				+ ", isCompilation=" + isCompilation + ", encoder=" + encoder + ", isrc=" + isrc + ", barcode="
				+ barcode + ", catalogueNumber=" + catalogueNumber + ", amazonId=" + amazonId + ", musicBrainzArtistId="
				+ musicBrainzArtistId + ", musicBrainzDiscId=" + musicBrainzDiscId + ", musicBrainzReleaseCountry="
				+ musicBrainzReleaseCountry + ", musicBrainzReleaseStatus=" + musicBrainzReleaseStatus
				+ ", musicBrainzReleaseType=" + musicBrainzReleaseType + ", musicBrainzReleaseArtistId="
				+ musicBrainzReleaseArtistId + ", musicBrainzReleaseId=" + musicBrainzReleaseId
				+ ", musicBrainzTrackId=" + musicBrainzTrackId + ", musicIpId=" + musicIpId + ", titleSort=" + titleSort
				+ ", artistSort=" + artistSort + ", albumSort=" + albumSort + ", albumArtistSort=" + albumArtistSort
				+ ", composerSort=" + composerSort + ", urlDiscogsArtistSite=" + urlDiscogsArtistSite
				+ ", urlDiscogsReleaseSite=" + urlDiscogsReleaseSite + ", urlLyricsSite=" + urlLyricsSite
				+ ", urlOfficialArtistSite=" + urlOfficialArtistSite + ", urlOfficialReleaseSite="
				+ urlOfficialReleaseSite + ", urlWikipediaReleaseSite=" + urlWikipediaReleaseSite
				+ ", urlWikipediaArtistSite=" + urlWikipediaArtistSite + "]";
	}

	public LibraryAudio InsertIntoAudioFile() {
		LibraryAudio audioFile = new LibraryAudio();
		audioFile.setAlbum(this.album);
		audioFile.setAlbumArtist(this.albumArtist);
		audioFile.setAlbumArtistSort(this.albumArtistSort);
		audioFile.setAlbumSort(this.albumSort);
		audioFile.setAmazonId(this.amazonId);
		audioFile.setArtist(this.artist);
		audioFile.setArtistSort(this.artistSort);
		audioFile.setBarcode(this.barcode);
		audioFile.setBpm(this.bpm);
		audioFile.setCatalogueNumber(this.catalogueNumber);
		audioFile.setComment(this.comment);
		audioFile.setComposer(this.composer);
		audioFile.setComposerSort(this.composerSort);
		audioFile.setConductor(this.conductor);
		audioFile.setCoverArt(this.coverArt);
		audioFile.setDiscNumber(this.discNumber);
		audioFile.setDiscTotal(this.discTotal);
		audioFile.setEncoder(this.encoder);
		audioFile.setGenre(this.genre);
		audioFile.setGrouping(this.grouping);
		audioFile.setIsCompilation(this.isCompilation);
		audioFile.setIsrc(this.isrc);
		audioFile.setKey(this.key);
		audioFile.setLanguage(this.language);
		audioFile.setLyrcist(this.lyrcist);
		audioFile.setLyrics(this.lyrics);
		audioFile.setMedia(this.media);
		audioFile.setMood(this.mood);
		audioFile.setMusicBrainzArtistId(this.musicBrainzArtistId);
		audioFile.setMusicBrainzDiscId(this.musicBrainzDiscId);
		audioFile.setMusicBrainzReleaseArtistId(this.musicBrainzReleaseArtistId);
		audioFile.setMusicBrainzReleaseCountry(this.musicBrainzReleaseCountry);
		audioFile.setMusicBrainzReleaseId(this.musicBrainzReleaseId);
		audioFile.setMusicBrainzReleaseStatus(this.musicBrainzReleaseStatus);
		audioFile.setMusicBrainzReleaseType(this.musicBrainzReleaseType);
		audioFile.setMusicBrainzTrackId(this.musicBrainzTrackId);
		audioFile.setMusicIpId(this.musicIpId);
		audioFile.setRecordLabel(this.recordLabel);
		audioFile.setRemixer(this.remixer);
		audioFile.setTitle(this.title);
		audioFile.setTitleSort(this.titleSort);
		audioFile.setTrack(this.track);
		audioFile.setTrackTotal(this.trackTotal);
		audioFile.setUrlDiscogsArtistSite(this.urlDiscogsArtistSite);
		audioFile.setUrlDiscogsReleaseSite(this.urlDiscogsReleaseSite);
		audioFile.setUrlLyricsSite(this.urlLyricsSite);
		audioFile.setUrlOfficialArtistSite(this.urlOfficialArtistSite);
		audioFile.setUrlOfficialReleaseSite(this.urlOfficialReleaseSite);
		audioFile.setUrlWikipediaArtistSite(this.urlWikipediaArtistSite);
		audioFile.setUrlWikipediaReleaseSite(this.urlWikipediaReleaseSite);
		audioFile.setYear(this.year);

		return audioFile;
	}
}
