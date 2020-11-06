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
@Table(name = "supported_file_types")
public class SupportedFileType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "supported_file_type_id")
	private Integer supportedFileTypeId;
	@Column(name = "supported_file_type_ext")
	private String supportedFileTypeExt;
	@Column(name = "media_category")
	private Integer mediaCategory;
	public Integer getSupportedFileTypeId() {
		return supportedFileTypeId;
	}
	public void setSupportedFileTypeId(Integer supportedFileTypeId) {
		this.supportedFileTypeId = supportedFileTypeId;
	}
	public String getSupportedFileTypeExt() {
		return supportedFileTypeExt;
	}
	public void setSupportedFileTypeExt(String supportedFileTypeExt) {
		this.supportedFileTypeExt = supportedFileTypeExt;
	}
	public Integer getMediaCategory() {
		return mediaCategory;
	}
	public void setMediaCategory(Integer mediaCategory) {
		this.mediaCategory = mediaCategory;
	}
	
	public SupportedFileType(Integer supportedFileTypeId, String supportedFileTypeExt, Integer mediaCategory) {
		this.supportedFileTypeId = supportedFileTypeId;
		this.supportedFileTypeExt = supportedFileTypeExt;
		this.mediaCategory = mediaCategory;
	}
	
	public SupportedFileType() {
	}
}
