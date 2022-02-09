package com.marcind.petshoprestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.marcind.PetShopRestAppApplication"})
public class PetShopRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetShopRestAppApplication.class, args);
	}

}
