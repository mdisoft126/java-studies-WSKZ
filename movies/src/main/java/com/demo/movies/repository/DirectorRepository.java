package com.demo.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.movies.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Long>{
}
