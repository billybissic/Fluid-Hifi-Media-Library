/**
 * 
 */
package com.fluidhifi.com.fluidhifi.mediadata.service;

import java.util.List;

/**
 * @author lahjeq taylor
 *
 */
public class LibraryDirectories {

	private List<LibraryDirectory> libraryDirectories;

	public LibraryDirectories(List<LibraryDirectory> libraryDirectories) {
		this.libraryDirectories = libraryDirectories;
	}

	public LibraryDirectories() {
	}

	public List<LibraryDirectory> getLibraryDirectories() {
		return libraryDirectories;
	}

	public void setLibraryDirectories(List<LibraryDirectory> libraryDirectories) {
		this.libraryDirectories = libraryDirectories;
	}

	public void addAll(List<LibraryDirectory> tempDirectories) {
		libraryDirectories = tempDirectories;
	}
}
