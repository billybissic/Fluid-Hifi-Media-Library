/**
* MIT License
*
* Copyright (c) 2018 Billy Bissic
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
**/
package com.fluidhifi.com.fluidhifi.mediadata.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application_settings")
public class ApplicationSettings {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="application_setting_id")
	private Integer applicationSettingsId; 
	
	@Column(name="application_setting_type")
	private String applicationSettingType;
	
	@Column(name="application_name")
	private String applicationName;
	
	@Column(name="application_setting_name")
	private String applicationSettingName;
	
	@Column(name="application_setting_description")
	private String applicationSettingDescription; 
	
	@Column(name="application_setting_value")
	private String applicationSettingValue;
	
	@Column(name="application_environment_mode")
	private String applicationEnvironmentMode;
	
	@Column(name="application_environment_os")
	private String applicationEnvironmentOS;
	
	 @Column(name="last_changed_timestamp")
	private String lastChangedTimestamp;
	
	@Column(name="last_modified_userid")
	private Integer lastModifiedUserid;
	
	/**
	 * @return the applicationSettingsId
	 */
	public Integer getApplicationSettingsId() {
		return applicationSettingsId;
	}
	/**
	 * @param applicationSettingsId the applicationSettingsId to set
	 */
	public void setApplicationSettingsId(Integer applicationSettingsId) {
		this.applicationSettingsId = applicationSettingsId;
	}
	/**
	 * @return the applicationSettingType
	 */
	public String getApplicationSettingType() {
		return applicationSettingType;
	}
	/**
	 * @param applicationSettingType the applicationSettingType to set
	 */
	public void setApplicationSettingType(String applicationSettingType) {
		this.applicationSettingType = applicationSettingType;
	}
	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}
	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	/**
	 * @return the applicationSettingName
	 */
	public String getApplicationSettingName() {
		return applicationSettingName;
	}
	/**
	 * @param applicationSettingName the applicationSettingName to set
	 */
	public void setApplicationSettingName(String applicationSettingName) {
		this.applicationSettingName = applicationSettingName;
	}
	/**
	 * @return the applicationSettingDescription
	 */
	public String getApplicationSettingDescription() {
		return applicationSettingDescription;
	}
	/**
	 * @param applicationSettingDescription the applicationSettingDescription to set
	 */
	public void setApplicationSettingDescription(String applicationSettingDescription) {
		this.applicationSettingDescription = applicationSettingDescription;
	}
	/**
	 * @return the applicationSettingValue
	 */
	public String getApplicationSettingValue() {
		return applicationSettingValue;
	}
	/**
	 * @param applicationSettingValue the applicationSettingValue to set
	 */
	public void setApplicationSettingValue(String applicationSettingValue) {
		this.applicationSettingValue = applicationSettingValue;
	}
	/**
	 * @return the applicationEnvironmentMode
	 */
	public String getApplicationEnvironmentMode() {
		return applicationEnvironmentMode;
	}
	/**
	 * @param applicationEnvironmentMode the applicationEnvironmentMode to set
	 */
	public void setApplicationEnvironmentMode(String applicationEnvironmentMode) {
		this.applicationEnvironmentMode = applicationEnvironmentMode;
	}
	/**
	 * @return the applicationEnvironmentOS
	 */
	public String getApplicationEnvironmentOS() {
		return applicationEnvironmentOS;
	}
	/**
	 * @param applicationEnvironmentOS the applicationEnvironmentOS to set
	 */
	public void setApplicationEnvironmentOS(String applicationEnvironmentOS) {
		this.applicationEnvironmentOS = applicationEnvironmentOS;
	}
	/**
	 * @return the lastChangedTimestamp
	 */
	public String getLastChangedTimestamp() {
		return lastChangedTimestamp;
	}
	/**
	 * @param lastChangedTimestamp the lastChangedTimestamp to set
	 */
	public void setLastChangedTimestamp(String lastChangedTimestamp) {
		this.lastChangedTimestamp = lastChangedTimestamp;
	}
	/**
	 * @return the lastModifiedUserid
	 */
	public Integer getLastModifiedUserid() {
		return lastModifiedUserid;
	}
	/**
	 * @param lastModifiedUserid the lastModifiedUserid to set
	 */
	public void setLastModifiedUserid(Integer lastModifiedUserid) {
		this.lastModifiedUserid = lastModifiedUserid;
	}
	/**
	 * @param applicationSettingsId
	 * @param applicationSettingType
	 * @param applicationName
	 * @param applicationSettingName
	 * @param applicationSettingDescription
	 * @param applicationSettingValue
	 * @param applicationEnvironmentMode
	 * @param applicationEnvironmentOS
	 * @param lastChangedTimestamp
	 * @param lastModifiedUserid
	 */
	public ApplicationSettings(Integer applicationSettingsId, String applicationSettingType, String applicationName,
			String applicationSettingName, String applicationSettingDescription, String applicationSettingValue,
			String applicationEnvironmentMode, String applicationEnvironmentOS, String lastChangedTimestamp,
			Integer lastModifiedUserid) {
		this.applicationSettingsId = applicationSettingsId;
		this.applicationSettingType = applicationSettingType;
		this.applicationName = applicationName;
		this.applicationSettingName = applicationSettingName;
		this.applicationSettingDescription = applicationSettingDescription;
		this.applicationSettingValue = applicationSettingValue;
		this.applicationEnvironmentMode = applicationEnvironmentMode;
		this.applicationEnvironmentOS = applicationEnvironmentOS;
		this.lastChangedTimestamp = lastChangedTimestamp;
		this.lastModifiedUserid = lastModifiedUserid;
	}
	/**
	 * 
	 */
	public ApplicationSettings() {
	}
}