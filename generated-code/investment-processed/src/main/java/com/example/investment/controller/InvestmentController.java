package com.example.investment.controller;

import com.example.investment.dto.InvestmentDTO;
import com.example.investment.service.InvestmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controller for managing investments.
 */
@RestController
@RequestMapping("/api/investments")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;

    /**
     * Creates a new investment.
     *
     * @param investmentDTO the investment data transfer object
     * @return ResponseEntity containing the created InvestmentDTO
     */
    @PostMapping
    @Operation(summary = "Create a new investment")
    @ApiResponse(responseCode = "200", description = "Investment created successfully")
    public ResponseEntity<InvestmentDTO> createInvestment(@RequestBody InvestmentDTO investmentDTO) {
        return ResponseEntity.ok(investmentService.createInvestment(investmentDTO));
    }

    /**
     * Retrieves investments by person ID.
     *
     * @param personId the ID of the person
     * @return ResponseEntity containing a list of InvestmentDTOs
     */
    @GetMapping("/person/{personId}")
    @Operation(summary = "Get investments by person ID")
    @ApiResponse(responseCode = "200", description = "List of investments retrieved successfully")
    public ResponseEntity<List<InvestmentDTO>> getInvestmentsByPersonId(@PathVariable Long personId) {
        return ResponseEntity.ok(investmentService.getInvestmentsByPersonId(personId));
    }

    /**
     * Calculates the total invested amount by person.
     *
     * @param personId the ID of the person
     * @return ResponseEntity containing the total invested amount
     */
    @GetMapping("/person/{personId}/total")
    @Operation(summary = "Calculate total invested by person")
    @ApiResponse(responseCode = "200", description = "Total invested amount retrieved successfully")
    public ResponseEntity<Double> calculateTotalInvestedByPerson(@PathVariable Long personId) {
        return ResponseEntity.ok(investmentService.calculateTotalInvestedByPerson(personId));
    }

    /**
     * Updates an existing investment.
     *
     * @param id the ID of the investment to update
     * @param investmentDTO the investment data transfer object with updated information
     * @return ResponseEntity containing the updated InvestmentDTO
     */
    @PutMapping("/{id}")
    @Operation(summary = "Update an existing investment")
    @ApiResponse(responseCode = "200", description = "Investment updated successfully")
    public ResponseEntity<InvestmentDTO> updateInvestment(@PathVariable Long id, @RequestBody InvestmentDTO investmentDTO) {
        return ResponseEntity.ok(investmentService.updateInvestment(id, investmentDTO));
    }

    /**
     * Deletes an investment.
     *
     * @param id the ID of the investment to delete
     * @return ResponseEntity with no content
     */
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete an investment")
    @ApiResponse(responseCode = "204", description = "Investment deleted successfully")
    public ResponseEntity<Void> deleteInvestment(@PathVariable Long id) {
        investmentService.deleteInvestment(id);
        return ResponseEntity.noContent().build();
    }
}