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
public interface SupportedFileTypeRepository extends JpaRepository<SupportedFileType, Integer> {

	@Query("SELECT sft FROM SupportedFileType sft WHERE sft.mediaCategory = :categoryId")
	List<SupportedFileType> findByMediaCategory(Integer categoryId);
}
