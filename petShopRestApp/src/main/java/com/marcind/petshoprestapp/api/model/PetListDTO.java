package com.marcind.petshoprestapp.api.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetListDTO {
	
	private List<PetDTO> petList;

}
