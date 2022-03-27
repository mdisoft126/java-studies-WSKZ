package com.demo.movies.service.director;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.movies.dto.DirectorDto;
import com.demo.movies.entity.Director;
import com.demo.movies.repository.DirectorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {
	
	private final DirectorRepository directorRepository;

	@Override
	public void saveDirector(DirectorDto directorDto) {
		Director director = new Director();
		director.setName(directorDto.getName());
		director.setSurname(directorDto.getSurname());
		directorRepository.save(director);
	}

	@Override
	public List<Director> getAllDirectors() {
		return directorRepository.findAll();
	}
}
