package com.demo.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.movies.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
}
