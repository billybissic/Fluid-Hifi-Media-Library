/**
 * 
 */
package com.fluidhifi.com.fluidhifi.mediadata.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author lahjeq taylor
 *
 */
public interface LibraryDirectoryRepository extends JpaRepository<LibraryDirectory, Integer> {

	@Query("SELECT ld FROM LibraryDirectory ld WHERE ld.libraryId = :libId")
	List<LibraryDirectory> findAllByLibraryId(Integer libId);

}
