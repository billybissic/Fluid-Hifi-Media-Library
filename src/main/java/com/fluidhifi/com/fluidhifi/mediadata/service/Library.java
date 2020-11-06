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
@Table(name = "libraries")
public class Library {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "library_id")
	private Integer libraryId;
	@Column(name = "library_name")
	private String libraryName;
	@Column(name = "media_category")
	private Integer mediaCategory;
	/**
	 * @return the libraryId
	 */
	public Integer getLibraryId() {
		return libraryId;
	}
	/**
	 * @param libraryId the libraryId to set
	 */
	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
	}
	/**
	 * @return the libraryName
	 */
	public String getLibraryName() {
		return libraryName;
	}
	/**
	 * @param libraryName the libraryName to set
	 */
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	/**
	 * @return the mediaCategory
	 */
	public Integer getMediaCategory() {
		return mediaCategory;
	}
	/**
	 * @param mediaCategory the mediaCategory to set
	 */
	public void setMediaCategory(Integer mediaCategory) {
		this.mediaCategory = mediaCategory;
	}
	public Library(Integer libraryId, String libraryName, Integer mediaCategory) {
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.mediaCategory = mediaCategory;
	}
	
	public Library() {
	}
}
