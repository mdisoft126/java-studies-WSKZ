package com.marcind.petshoprestapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.api.model.PetListDTO;
import com.marcind.petshoprestapp.services.PetService;

@RestController
@RequestMapping("/api/pet/")
public class PetController {
	
	private final PetService petService;
	
	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}

	@GetMapping("{id}")
	@ResponseStatus(HttpStatus.OK) //new way of working --> RestController instead of Controller
	public PetDTO getPetById(@PathVariable Long id) {
		return petService.getPetById(id);
	}
	
	@GetMapping("findByStatus/{status}")
	public ResponseEntity<PetListDTO> getPetsByStatus(@PathVariable String status) {
		return new ResponseEntity<PetListDTO>(
			new PetListDTO(petService.getPetsByStatus(status)), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<PetDTO> createNewPet(@RequestBody PetDTO petDTO) {
		return new ResponseEntity<PetDTO>(petService.createNewPet(petDTO), HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<PetDTO> updatePet(@PathVariable Long id, @RequestBody PetDTO petDTO) {
		return new ResponseEntity<PetDTO>(petService.updatePet(id, petDTO), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deletePet(@PathVariable Long id) {
		
		petService.deletePetById(id);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
 