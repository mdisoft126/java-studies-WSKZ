package com.marcind.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcind.repositories.ArtistRepository;

@Controller
public class ArtistController {
	
	private ArtistRepository artistRepository;
	
	public ArtistController(ArtistRepository artistRepository) {
		super();
		this.artistRepository = artistRepository;
	}

	@RequestMapping(value = {"/artists", "/artist/list"})
	public String getArtist(Model model) {
		
		model.addAttribute("artists", artistRepository.findAll());
		return "artist/list";
	}
	
	@GetMapping("/artist/new")
	public String newArtist(Model model) {
		model.addAllAttributes("artist", new ArtistCommand());
		return "artist/addedit";
	}
}
