package com.marcind.springdatarestrepositories.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcind.springdatarestrepositories.domain.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
