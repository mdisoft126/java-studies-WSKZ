package com.marcind.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.marcind.commands.ArtistCommand;
import com.marcind.model.Artist;

import lombok.Synchronized;

@Component
public class ArtistCommandToArtist implements Converter<ArtistCommand, Artist> {

	@Synchronized
	@Nullable
	@Override
	public Artist convert(ArtistCommand source) {
		
		final Artist artist = new Artist();
//		artist.setId(source.getId());
		artist.setFirstName(source.getFirstName());
		artist.setLastName(source.getLastName());
		artist.setNick(source.getNick());
		
		// TODO Auto-generated method stub
		return artist;
	}

}
