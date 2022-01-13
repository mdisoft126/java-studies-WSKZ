package com.marcind.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcind.repositories.SongRepository;

@Controller
public class SongController {

	private SongRepository songRepository;
	
	public SongController(SongRepository songRepository) {
		super();
		this.songRepository = songRepository;
	}

	@RequestMapping(value = {"/songs", "/song/list"})
	public String getSongs(Model model) {
		
		model.addAttribute("songs", songRepository.findAll());
		return "song/list";
	}
	
}
