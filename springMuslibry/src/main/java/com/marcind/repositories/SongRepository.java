package com.marcind.repositories;

import org.springframework.data.repository.CrudRepository;

import com.marcind.model.Song;

public interface SongRepository extends CrudRepository<Song, Long>{

}
