package com.example.investment.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Data Transfer Object for Person.
 */
public class PersonDTO {

    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    private String fullName;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String taxId;

    private List<InvestmentDTO> investments;

    /**
     * Gets the ID of the person.
     * 
     * @return the ID of the person.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the person.
     * 
     * @param id the ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the full name of the person.
     * 
     * @return the full name of the person.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of the person.
     * 
     * @param fullName the full name to set.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Gets the email of the person.
     * 
     * @return the email of the person.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the person.
     * 
     * @param email the email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the tax ID of the person.
     * 
     * @return the tax ID of the person.
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the tax ID of the person.
     * 
     * @param taxId the tax ID to set.
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Gets the list of investments associated with the person.
     * 
     * @return the list of investments.
     */
    public List<InvestmentDTO> getInvestments() {
        return investments;
    }

    /**
     * Sets the list of investments associated with the person.
     * 
     * @param investments the list of investments to set.
     */
    public void setInvestments(List<InvestmentDTO> investments) {
        this.investments = investments;
    }
}