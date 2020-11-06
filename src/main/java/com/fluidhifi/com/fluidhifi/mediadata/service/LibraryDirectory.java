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
@Table(name = "library_directories")
public class LibraryDirectory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "directory_id")
	private Integer directoryId;
	@Column(name = "directory_path")
	private String directoryPath;
	@Column(name = "library_id")
	private Integer libraryId;
	
	public Integer getDirectoryId() {
		return directoryId;
	}
	public void setDirectoryId(Integer directoryId) {
		this.directoryId = directoryId;
	}
	public String getDirectoryPath() {
		return directoryPath;
	}
	public void setDirectoryPath(String directoryPath) {
		this.directoryPath = directoryPath;
	}
	public Integer getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
	}
	
	public LibraryDirectory(Integer directoryId, String directoryPath, Integer libraryId) {
		this.directoryId = directoryId;
		this.directoryPath = directoryPath;
		this.libraryId = libraryId;
	}
	
	public LibraryDirectory() {
	}
	
	@Override
	public String toString() {
		return "LibraryDirectory [directoryId=" + directoryId + ", directoryPath=" + directoryPath + ", libraryId="
				+ libraryId + "]";
	}
}
