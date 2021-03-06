package com.demo.movies.service.director;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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

	@Override
	public void deleteDirectorById(Long id) {
		directorRepository.deleteDirectorById(id);
	}

	@Override
	@Transactional(rollbackOn = {SQLException.class})
	public void updateDirectorNameAndSurname(DirectorDto directorDto) throws SQLException {
		Optional<Director> directorOptional = directorRepository.findById(directorDto.getId());
		Director director;
		if (directorOptional.isPresent()) {
			director = directorOptional.get();
			director.setName(directorDto.getName());
			director.setSurname(directorDto.getSurname());
			directorRepository.save(director);
			throw new SQLException();
		}
	}
}
