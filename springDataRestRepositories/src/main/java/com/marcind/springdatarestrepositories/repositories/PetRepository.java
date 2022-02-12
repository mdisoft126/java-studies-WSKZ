package com.marcind.springdatarestrepositories.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.marcind.springdatarestrepositories.domain.Pet;

@RepositoryRestResource(collectionResourceRel = "pet", path = "pet")
public interface PetRepository extends JpaRepository<Pet, Long> {
	
	List<Pet> findByStatus(@Param("status") String status);

}
