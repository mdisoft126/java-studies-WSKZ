package com.demo.movies.conroller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.movies.dto.DirectorDto;
import com.demo.movies.entity.Director;
import com.demo.movies.service.director.DirectorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DirectorController {
	
	private final DirectorService directorService;
	
	@PostMapping("save-director")
	private ResponseEntity<String> saveDirector(@RequestBody DirectorDto directorDto) {
		directorService.saveDirector(directorDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("get-all-directors")
	private List<Director> getAllDirectors() {
		return directorService.getAllDirectors();
	}
	
	@DeleteMapping("delete-director/{id}")
	private void deleteDirectorById(@PathVariable Long id) {
		directorService.deleteDirectorById(id);
	}
	
	@PatchMapping("update-director")
	private ResponseEntity<String> updateDirectorNameAndSurname(@RequestBody DirectorDto directorDto) throws SQLException {
		directorService.updateDirectorNameAndSurname(directorDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
