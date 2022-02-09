package com.marcind.petshoprestapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.api.model.PetListDTO;
import com.marcind.petshoprestapp.services.PetService;

@Controller
@RequestMapping("/api/pet/")
public class PetController {
	
	private final PetService petService;
	
	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}

	@GetMapping("{id}")
	public ResponseEntity<PetDTO> getPetById(@PathVariable Long id) {
		return new ResponseEntity<PetDTO>(petService.getPetById(id), HttpStatus.OK);
	}
	
	@GetMapping("findByStatus")
	public ResponseEntity<PetListDTO> getPetsByStatus(@RequestParam String status) {
		return new ResponseEntity<PetListDTO>(
			new PetListDTO(petService.getPetsByStatus(status)), HttpStatus.OK);
	}
}
 