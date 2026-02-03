package com.example.investment.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Represents an investment entity.
 */
@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Double amountUSD;

    private Date investmentDate;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    /**
     * Gets the ID of the investment.
     * 
     * @return the ID of the investment.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the investment.
     * 
     * @param id the ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the type of the investment.
     * 
     * @return the type of the investment.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the investment.
     * 
     * @param type the type to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the amount in USD of the investment.
     * 
     * @return the amount in USD of the investment.
     */
    public Double getAmountUSD() {
        return amountUSD;
    }

    /**
     * Sets the amount in USD of the investment.
     * 
     * @param amountUSD the amount in USD to set.
     */
    public void setAmountUSD(Double amountUSD) {
        this.amountUSD = amountUSD;
    }

    /**
     * Gets the investment date.
     * 
     * @return the investment date.
     */
    public Date getInvestmentDate() {
        return investmentDate;
    }

    /**
     * Sets the investment date.
     * 
     * @param investmentDate the investment date to set.
     */
    public void setInvestmentDate(Date investmentDate) {
        this.investmentDate = investmentDate;
    }

    /**
     * Gets the person associated with the investment.
     * 
     * @return the person associated with the investment.
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the person associated with the investment.
     * 
     * @param person the person to set.
     */
    public void setPerson(Person person) {
        this.person = person;
    }
}