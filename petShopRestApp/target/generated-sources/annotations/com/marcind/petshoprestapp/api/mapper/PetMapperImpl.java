package com.marcind.petshoprestapp.api.mapper;

import com.marcind.petshoprestapp.api.model.PetDTO;
import com.marcind.petshoprestapp.domain.Pet;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-11T23:31:21+0100",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 16.0.2 (Oracle Corporation)"
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

    @Override
    public Pet petDTOtoPet(PetDTO petDTO) {
        if ( petDTO == null ) {
            return null;
        }

        Pet pet = new Pet();

        pet.setId( petDTO.getId() );
        pet.setName( petDTO.getName() );
        pet.setStatus( petDTO.getStatus() );

        return pet;
    }
}
