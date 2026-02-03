package com.example.investment.mapper;

import com.example.investment.dto.PersonDTO;
import com.example.investment.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

/**
 * Mapper interface for converting between Person and PersonDTO objects.
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    /**
     * Converts a Person entity to a PersonDTO.
     *
     * @param person the Person entity to convert
     * @return the converted PersonDTO
     */
    PersonDTO toDto(Person person);

    /**
     * Converts a PersonDTO to a Person entity.
     *
     * @param personDTO the PersonDTO to convert
     * @return the converted Person entity
     */
    Person toEntity(PersonDTO personDTO);

    /**
     * Converts a list of Person entities to a list of PersonDTOs.
     *
     * @param persons the list of Person entities to convert
     * @return the list of converted PersonDTOs
     */
    List<PersonDTO> toDtoList(List<Person> persons);
}