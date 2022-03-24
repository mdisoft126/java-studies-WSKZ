package com.marcind.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marcind.restapi.model.dto.NameDto;

@RestController
public class AppController {
	
	@GetMapping("hello")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
	
	@GetMapping("hello/{name}")
	public String helloName(@PathVariable String name) {
		return "Hello " + name + "!";
	}
	
	@GetMapping("hello/param")
	public String helloParam(@RequestParam String name) {
		return "Hello " + name + "!";
	}
	
	@PostMapping("hello/body")
	public ResponseEntity<String> helloBody(@RequestBody NameDto nameDto) {
		if(nameDto.getName().equals("Marcin")) {
			return new ResponseEntity<>("OK", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("NOT FOUND", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("hello/header")
	public String helloHeader(@RequestHeader("name") String name) {
		return "Hello " + name + "!";
	}

}
