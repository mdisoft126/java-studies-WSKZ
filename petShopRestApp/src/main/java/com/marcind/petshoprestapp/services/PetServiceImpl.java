package com.marcind.petshoprestapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.marcind.petshoprestapp.api.mapper.PetMapper;
import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.domain.Pet;
import com.marcind.petshoprestapp.repositories.PetRepository;

@Service
public class PetServiceImpl implements PetService {

	PetRepository petRepository;
	PetMapper petMapper;
	
	public PetServiceImpl(PetRepository petRepository, PetMapper petMapper) {
//		super();
		this.petRepository = petRepository;
		this.petMapper = petMapper;
	}

	@Override
	public List<PetDTO> getAllPets() {
		return petRepository.findAll()
				.stream()
				.map(petMapper::petToPetDTO)
				.collect(Collectors.toList());
	}

	@Override
	public PetDTO getPetById(Long id) {
		return petMapper.petToPetDTO(petRepository.findById(id).get());
	}

	@Override
	public List<PetDTO> getPetsByStatus(String status) {
		return petRepository.getByStatus(status)
				.stream()
				.map(petMapper::petToPetDTO)
				.collect(Collectors.toList());
	}

	@Override
	public PetDTO createNewPet(PetDTO petDTO) {
		
		Pet pet = petMapper.petDTOtoPet(petDTO);
		Pet savedPet = petRepository.save(pet);
		
		return petMapper.petToPetDTO(savedPet);
	}

	@Override
	public PetDTO updatePet(Long id, PetDTO petDTO) {
		
		Pet pet = petMapper.petDTOtoPet(petDTO);
		pet.setId(id);
		
		Pet savedPet = petRepository.save(pet);
		
		return petMapper.petToPetDTO(savedPet);
	}

}
