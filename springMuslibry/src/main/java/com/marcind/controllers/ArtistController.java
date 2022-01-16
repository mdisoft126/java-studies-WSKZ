package com.marcind.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcind.commands.ArtistCommand;
import com.marcind.converters.ArtistCommandToArtist;
import com.marcind.model.Artist;
import com.marcind.repositories.ArtistRepository;

@Controller
public class ArtistController {
	
	private ArtistRepository artistRepository;
	private ArtistCommandToArtist artistCommandToArtist;
	
	public ArtistController(ArtistRepository artistRepository, ArtistCommandToArtist artistCommandToArtist) {
		super();
		this.artistRepository = artistRepository;
		this.artistCommandToArtist = artistCommandToArtist;
	}

	@RequestMapping(value = {"/artists", "/artist/list"})
	public String getArtist(Model model) {
		
		model.addAttribute("artists", artistRepository.findAll());
		return "artist/list";
	}
	
	@GetMapping("/artist/new")
	public String newArtist(Model model) {
		model.addAttribute("artist", new ArtistCommand());
		return "artist/addedit";
	}
	
	@PostMapping("artist")
	public String saveOrUpdate(@ModelAttribute ArtistCommand command) {

		Artist detachedArtist = artistCommandToArtist.convert(command);
		Artist savedArtist = artistRepository.save(detachedArtist);
		return "redirect:/artist/" + savedArtist.getId() + "/show";

		
	}
	
}
