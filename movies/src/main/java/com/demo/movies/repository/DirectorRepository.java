package com.demo.movies.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.movies.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Long>{
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Director d WHERE d.id = :id")
	void deleteDirectorById(@Param("id") Long id);
}
