package com.marcind.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.marcind.commands.ArtistCommand;
import com.marcind.model.Artist;

import lombok.Synchronized;

@Component
public class ArtistToArtistCommand implements Converter<Artist, ArtistCommand>{

	@Synchronized
	@Nullable
	@Override
	public ArtistCommand convert(Artist source) {
		
		final ArtistCommand command = new ArtistCommand();
		command.setId(source.getId());
		command.setFirstName(source.getFirstName());
		command.setLastName(source.getLastName());
		// TODO Auto-generated method stub
		return null;
	}
	

}
