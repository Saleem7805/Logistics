package com.example.libraryManagementCrud;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends JpaRepository<LibraryEntity,Integer> {
 
	@Transactional
	 @Modifying
	    @Query("UPDATE LibraryEntity c SET c.author =:AI WHERE c.lid = :lid")
	    void updateTheAuthor(@Param("lid") int lid, @Param("AI") String newAuthor);
	}

	


