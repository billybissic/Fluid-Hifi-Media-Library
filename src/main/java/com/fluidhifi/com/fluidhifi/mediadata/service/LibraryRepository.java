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
public interface LibraryRepository extends JpaRepository<Library, Integer> {

	@Query("SELECT l FROM Library l WHERE l.mediaCategory = :categoryId")
	List<Library> findByMediaCategory(Integer categoryId);

}
