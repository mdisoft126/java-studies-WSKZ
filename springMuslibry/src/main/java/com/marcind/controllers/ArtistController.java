package com.marcind.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcind.commands.ArtistCommand;
import com.marcind.converters.ArtistCommandToArtist;
import com.marcind.converters.ArtistToArtistCommand;
import com.marcind.model.Artist;
import com.marcind.repositories.ArtistRepository;

@Controller
public class ArtistController {
	
	private ArtistRepository artistRepository;
	private ArtistCommandToArtist artistCommandToArtist;
	private ArtistToArtistCommand artistToArtistCommand;

	public ArtistController(ArtistRepository artistRepository, ArtistCommandToArtist artistCommandToArtist,
			ArtistToArtistCommand artistToArtistCommand) {
		super();
		this.artistRepository = artistRepository;
		this.artistCommandToArtist = artistCommandToArtist;
		this.artistToArtistCommand = artistToArtistCommand;
	}

	@RequestMapping(value = {"/artists", "/artist/list"})
	public String getArtists(Model model) {
		
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

		Optional<Artist> artistOptional = artistRepository.findById(command.getId());
		
		if (!artistOptional.isPresent()) {
			Artist detachedArtist = artistCommandToArtist.convert(command);
			Artist savedArtist = artistRepository.save(detachedArtist);
			return "redirect:/artist/" + savedArtist.getId() + "/show";
		} else {
			System.out.println("There is such artist in db");
			Artist artistFromDatabase = artistOptional.get();
			artistFromDatabase.setFirstName(command.getFirstName());
			artistFromDatabase.setLastName(command.getLastName());
			artistFromDatabase.setNick(command.getNick());
			artistRepository.save(artistFromDatabase);
			return "redirect:/artist/" + artistFromDatabase.getId() + "/show";
		}
	}
	
	@RequestMapping("/artist/{id}/edit")
	public String editArtist(Model model, @PathVariable("id") Long id) {
		model.addAttribute("artist", artistToArtistCommand.convert(
				artistRepository.findById(id).get()
				));
		return "artist/addedit";
	}
	
}
