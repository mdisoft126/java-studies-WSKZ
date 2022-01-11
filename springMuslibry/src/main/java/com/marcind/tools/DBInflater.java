package com.marcind.tools;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.marcind.model.Artist;
import com.marcind.model.Publisher;
import com.marcind.model.Song;
import com.marcind.repositories.ArtistRepository;
import com.marcind.repositories.PublisherRepository;
import com.marcind.repositories.SongRepository;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent>{
	
	private SongRepository songRepository;
	private ArtistRepository artistRepository;
	private PublisherRepository publisherRepository;
	
	public DBInflater(SongRepository songRepository, ArtistRepository artistRepository,
			PublisherRepository publisherRepository) {
		super();
		this.songRepository = songRepository;
		this.artistRepository = artistRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}
	
	private void initData( ) {
		
		Artist johnny = new Artist("Johnny", "Cash", "cash");
		Publisher columbia = new Publisher("Columbia Records");
		Song aBoyNamedSue = new Song("A Boy named Sue", "coutry", "12321345", "1969", columbia);
		johnny.getSongs().add(aBoyNamedSue);
		aBoyNamedSue.getArtists().add(johnny);
		publisherRepository.save(columbia);
		artistRepository.save(johnny);
		songRepository.save(aBoyNamedSue);
		
		Artist bob = new Artist("Bob", "Marley", "bob");
		Publisher island = new Publisher("Island Records");
		Song threeLittleBirds = new Song("Three little birds", "reagge", "55321345", "1977", island);
		bob.getSongs().add(threeLittleBirds);
		threeLittleBirds.getArtists().add(bob);
		publisherRepository.save(island);
		artistRepository.save(bob);
		songRepository.save(threeLittleBirds);
		
		Artist freddie = new Artist("Freddie", "Mercury", "freddie");
		Publisher emi = new Publisher("EMI");
		Song callingAllGirls = new Song("Calling all girls", "Many", "18821345", "1982", emi);
		freddie.getSongs().add(callingAllGirls);
		callingAllGirls.getArtists().add(freddie);
		publisherRepository.save(emi);
		artistRepository.save(freddie);
		songRepository.save(callingAllGirls);
		
	}
}
