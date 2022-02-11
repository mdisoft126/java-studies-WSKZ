package com.marcind.petshoprestapp.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.domain.Pet;

@Mapper
public interface PetMapper {
	
	PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);
	
	PetDTO petToPetDTO(Pet pet);
	
	Pet petDTOtoPet(PetDTO petDTO);

}
