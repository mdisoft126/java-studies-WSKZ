package com.marcind.springdatarestrepositories.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.marcind.springdatarestrepositories.domain.Pet;
import com.marcind.springdatarestrepositories.repositories.PetRepository;

@Component
public class DBDataLoader implements CommandLineRunner {

	private final PetRepository petRepository;
	
	public DBDataLoader(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pet dog = new Pet();
		dog.setName("Dog");
		dog.setStatus("available");
		
		Pet cat = new Pet();
		cat.setName("Cat");
		cat.setStatus("available");
		
		Pet parrot = new Pet();
		parrot.setName("Parrot");
		parrot.setStatus("available");
		
		petRepository.save(dog);
		petRepository.save(cat);
		petRepository.save(parrot);
		
	}

}
