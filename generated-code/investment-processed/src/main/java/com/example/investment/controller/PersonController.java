package com.example.investment.controller;

import com.example.investment.dto.PersonDTO;
import com.example.investment.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controller for managing person-related operations.
 */
@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    /**
     * Creates a new person.
     *
     * @param personDTO the person data transfer object containing the details of the person to be created
     * @return ResponseEntity containing the created PersonDTO
     */
    @PostMapping
    @Operation(summary = "Create a new person")
    @ApiResponse(responseCode = "200", description = "Person created successfully")
    public ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO personDTO) {
        return ResponseEntity.ok(personService.createPerson(personDTO));
    }

    /**
     * Retrieves all persons.
     *
     * @return ResponseEntity containing a list of PersonDTOs
     */
    @GetMapping
    @Operation(summary = "Get all persons")
    @ApiResponse(responseCode = "200", description = "List of persons retrieved successfully")
    public ResponseEntity<List<PersonDTO>> getAllPersons() {
        return ResponseEntity.ok(personService.getAllPersons());
    }

    /**
     * Retrieves a person by their ID.
     *
     * @param id the ID of the person to be retrieved
     * @return ResponseEntity containing the PersonDTO
     */
    @GetMapping("/{id}")
    @Operation(summary = "Get person by ID")
    @ApiResponse(responseCode = "200", description = "Person retrieved successfully")
    @ApiResponse(responseCode = "404", description = "Person not found")
    public ResponseEntity<PersonDTO> getPersonById(@PathVariable Long id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }

    /**
     * Updates a person by their ID.
     *
     * @param id the ID of the person to be updated
     * @param personDTO the person data transfer object containing the updated details
     * @return ResponseEntity containing the updated PersonDTO
     */
    @PutMapping("/{id}")
    @Operation(summary = "Update person by ID")
    @ApiResponse(responseCode = "200", description = "Person updated successfully")
    @ApiResponse(responseCode = "404", description = "Person not found")
    public ResponseEntity<PersonDTO> updatePerson(@PathVariable Long id, @RequestBody PersonDTO personDTO) {
        return ResponseEntity.ok(personService.updatePerson(id, personDTO));
    }

    /**
     * Deletes a person by their ID.
     *
     * @param id the ID of the person to be deleted
     * @return ResponseEntity with no content
     */
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete person by ID")
    @ApiResponse(responseCode = "204", description = "Person deleted successfully")
    @ApiResponse(responseCode = "404", description = "Person not found")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }
}