package com.marcind.petshoprestapp.services;

import java.util.List;
import com.marcind.petshoprestapp.api.model.PetDTO;

public interface PetService {
	
	List<PetDTO> getAllPets();
	PetDTO getPetById(Long id);
	List<PetDTO> getPetsByStatus(String status);

}
