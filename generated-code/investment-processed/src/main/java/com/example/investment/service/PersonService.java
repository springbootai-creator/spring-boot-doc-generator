package com.example.investment.service;

import com.example.investment.dto.PersonDTO;
import com.example.investment.mapper.PersonMapper;
import com.example.investment.model.Person;
import com.example.investment.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Service class for managing persons.
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    /**
     * Creates a new person.
     *
     * @param personDTO the person data transfer object
     * @return the created person data transfer object
     */
    public PersonDTO createPerson(PersonDTO personDTO) {
        Person person = personMapper.toEntity(personDTO);
        person = personRepository.save(person);
        return personMapper.toDto(person);
    }

    /**
     * Retrieves all persons.
     *
     * @return a list of person data transfer objects
     */
    public List<PersonDTO> getAllPersons() {
        return personMapper.toDtoList(personRepository.findAll());
    }

    /**
     * Retrieves a person by their ID.
     *
     * @param id the ID of the person
     * @return the person data transfer object, or null if not found
     */
    public PersonDTO getPersonById(Long id) {
        return personMapper.toDto(personRepository.findById(id).orElse(null));
    }

    /**
     * Updates an existing person.
     *
     * @param id the ID of the person to update
     * @param personDTO the person data transfer object with updated information
     * @return the updated person data transfer object
     */
    public PersonDTO updatePerson(Long id, PersonDTO personDTO) {
        Person person = personMapper.toEntity(personDTO);
        person.setId(id);
        person = personRepository.save(person);
        return personMapper.toDto(person);
    }

    /**
     * Deletes a person by their ID.
     *
     * @param id the ID of the person to delete
     */
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}