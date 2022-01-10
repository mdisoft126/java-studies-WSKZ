package com.marcind.repositories;

import org.springframework.data.repository.CrudRepository;

import com.marcind.model.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long>{

}
