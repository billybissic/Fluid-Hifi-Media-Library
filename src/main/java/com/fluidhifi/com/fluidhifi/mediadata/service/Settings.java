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
@Table(name = "settings")
public class Settings {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="setting_id")
	private Integer settingsId; 
	
	/*@Column(name="application_setting_type")
	private String applicationSettingType;
	
	@Column(name="application_name")
	private String applicationName;*/
	
	@Column(name="setting_name")
	private String settingName;
	
	@Column(name="setting_description")
	private String settingDescription; 
	
	@Column(name="setting_value")
	private String settingValue;
	
	@Column(name="environment_mode")
	private String environmentMode;
	
	@Column(name="environment_os")
	private String environmentOS;
	
	 @Column(name="last_changed_timestamp")
	private String lastChangedTimestamp;
	
	@Column(name="last_modified_userid")
	private Integer lastModifiedUserid;

	public Integer getSettingsId() {
		return settingsId;
	}

	public void setSettingsId(Integer settingsId) {
		this.settingsId = settingsId;
	}

	public String getSettingName() {
		return settingName;
	}

	public void setSettingName(String settingName) {
		this.settingName = settingName;
	}

	public String getSettingDescription() {
		return settingDescription;
	}

	public void setSettingDescription(String settingDescription) {
		this.settingDescription = settingDescription;
	}

	public String getSettingValue() {
		return settingValue;
	}

	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
	}

	public String getEnvironmentMode() {
		return environmentMode;
	}

	public void setEnvironmentMode(String environmentMode) {
		this.environmentMode = environmentMode;
	}

	public String getEnvironmentOS() {
		return environmentOS;
	}

	public void setEnvironmentOS(String environmentOS) {
		this.environmentOS = environmentOS;
	}

	public String getLastChangedTimestamp() {
		return lastChangedTimestamp;
	}

	public void setLastChangedTimestamp(String lastChangedTimestamp) {
		this.lastChangedTimestamp = lastChangedTimestamp;
	}

	public Integer getLastModifiedUserid() {
		return lastModifiedUserid;
	}

	public void setLastModifiedUserid(Integer lastModifiedUserid) {
		this.lastModifiedUserid = lastModifiedUserid;
	}

	public Settings(Integer settingsId, String settingName, String settingDescription, String settingValue,
			String environmentMode, String environmentOS, String lastChangedTimestamp, Integer lastModifiedUserid) {
		this.settingsId = settingsId;
		this.settingName = settingName;
		this.settingDescription = settingDescription;
		this.settingValue = settingValue;
		this.environmentMode = environmentMode;
		this.environmentOS = environmentOS;
		this.lastChangedTimestamp = lastChangedTimestamp;
		this.lastModifiedUserid = lastModifiedUserid;
	}

	public Settings() {
	}
}