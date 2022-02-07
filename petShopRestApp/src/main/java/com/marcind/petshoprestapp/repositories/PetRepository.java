package com.marcind.petshoprestapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcind.petshoprestapp.domain.Pet;


public interface PetRepository extends JpaRepository<Pet, Long> {

}
