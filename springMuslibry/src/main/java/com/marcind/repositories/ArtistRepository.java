package com.marcind.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.marcind.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long>{
	
	Optional<Artist> getFisrtByFirstNameAndLastName(String firstName, String lastName);
	Optional<Artist> getFirstByFirstName(String firstName);
	Optional<Artist> getFirstById(Long id);

}
