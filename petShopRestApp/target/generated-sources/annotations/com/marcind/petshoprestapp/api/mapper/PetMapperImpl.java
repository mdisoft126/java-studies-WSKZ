package com.marcind.petshoprestapp.api.mapper;

import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.domain.Pet;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-11T22:07:47+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class PetMapperImpl implements PetMapper {

    @Override
    public PetDTO petToPetDTO(Pet pet) {
        if ( pet == null ) {
            return null;
        }

        PetDTO petDTO = new PetDTO();

        petDTO.setId( pet.getId() );
        petDTO.setName( pet.getName() );
        petDTO.setStatus( pet.getStatus() );

        return petDTO;
    }
}
