package com.marcind.petshoprestapp.bootrstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.marcind.petshoprestapp.domain.Pet;
import com.marcind.petshoprestapp.repositories.PetRepository;

@Component
public class DBDataLoader implements CommandLineRunner {

	PetRepository petRepository;
	
	public DBDataLoader(PetRepository petRepository) {
//		super();
		this.petRepository = petRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Pet dog = new Pet();
		dog.setName("Dog");
		dog.setStatus("available");
		
		Pet cat = new Pet();
		cat.setName("Cat");
		cat.setStatus("available");
		
		Pet parrot = new Pet();
		parrot.setName("Parrot");
		parrot.setStatus("available");
		
		Pet cow = new Pet();
		cow.setName("Cow");
		cow.setStatus("available");
		
		Pet horse = new Pet();
		horse.setName("Horse");
		horse.setStatus("available");
		
		petRepository.save(dog);
		petRepository.save(cat);
		petRepository.save(parrot);
		petRepository.save(cow);
		petRepository.save(horse);
		
		System.out.println("Data loaded to DB!");
		
	}

}
