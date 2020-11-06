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
@Table(name = "media_categories")
public class MediaCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "media_category_id")
	private Integer mediaCategoryId;
	@Column(name = "media_category")
	private String mediaCategory;
	@Column(name = "media_category_description")
	private String mediaCategoryDescription;
	
	/**
	 * @return the mediaCategoryId
	 */
	public Integer getMediaCategoryId() {
		return mediaCategoryId;
	}
	/**
	 * @param mediaCategoryId the mediaCategoryId to set
	 */
	public void setMediaCategoryId(Integer mediaCategoryId) {
		this.mediaCategoryId = mediaCategoryId;
	}
	/**
	 * @return the mediaCategory
	 */
	public String getMediaCategory() {
		return mediaCategory;
	}
	/**
	 * @param mediaCategory the mediaCategory to set
	 */
	public void setMediaCategory(String mediaCategory) {
		this.mediaCategory = mediaCategory;
	}
	/**
	 * @return the mediaCategoryDescription
	 */
	public String getMediaCategoryDescription() {
		return mediaCategoryDescription;
	}
	/**
	 * @param mediaCategoryDescription the mediaCategoryDescription to set
	 */
	public void setMediaCategoryDescription(String mediaCategoryDescription) {
		this.mediaCategoryDescription = mediaCategoryDescription;
	}
	
	public MediaCategory(Integer mediaCategoryId, String mediaCategory, String mediaCategoryDescription) {
		this.mediaCategoryId = mediaCategoryId;
		this.mediaCategory = mediaCategory;
		this.mediaCategoryDescription = mediaCategoryDescription;
	}
	
	public MediaCategory() {
	}
}
