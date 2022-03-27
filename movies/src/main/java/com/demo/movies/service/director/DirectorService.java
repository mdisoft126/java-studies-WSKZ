package com.demo.movies.service.director;

import java.util.List;

import com.demo.movies.dto.DirectorDto;
import com.demo.movies.entity.Director;

public interface DirectorService {
	
	void saveDirector(DirectorDto directorDto);
	
	List<Director> getAllDirectors();

}
