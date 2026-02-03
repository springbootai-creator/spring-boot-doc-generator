package com.example.investment.model;

import javax.persistence.*;
import java.util.List;

/**
 * Represents a person in the investment model.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String taxId;

    @OneToMany(mappedBy = "person")
    private List<Investment> investments;

    /**
     * Gets the unique identifier of the person.
     * 
     * @return the id of the person.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the person.
     * 
     * @param id the id to set for the person.
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
     * @param fullName the full name to set for the person.
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
     * @param email the email to set for the person.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the tax identification number of the person.
     * 
     * @return the tax ID of the person.
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the tax identification number of the person.
     * 
     * @param taxId the tax ID to set for the person.
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Gets the list of investments associated with the person.
     * 
     * @return the list of investments.
     */
    public List<Investment> getInvestments() {
        return investments;
    }

    /**
     * Sets the list of investments associated with the person.
     * 
     * @param investments the list of investments to set for the person.
     */
    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}