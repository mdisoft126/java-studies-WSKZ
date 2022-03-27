package com.demo.movies.dto;

import com.demo.movies.entity.Director;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MovieDto {
	private Long id;
	
	private String title;
	
	private Director director;
}
