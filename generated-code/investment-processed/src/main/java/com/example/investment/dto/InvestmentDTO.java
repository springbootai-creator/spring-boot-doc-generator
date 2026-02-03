package com.example.investment.dto;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Data Transfer Object for Investment.
 */
public class InvestmentDTO {

    private Long id;

    @NotNull
    private String type;

    @NotNull
    private Double amountUSD;

    @NotNull
    private Date investmentDate;

    private Long personId;

    /**
     * Gets the ID of the investment.
     * 
     * @return the ID of the investment
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the investment.
     * 
     * @param id the ID of the investment
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the type of the investment.
     * 
     * @return the type of the investment
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the investment.
     * 
     * @param type the type of the investment
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the amount of the investment in USD.
     * 
     * @return the amount of the investment in USD
     */
    public Double getAmountUSD() {
        return amountUSD;
    }

    /**
     * Sets the amount of the investment in USD.
     * 
     * @param amountUSD the amount of the investment in USD
     */
    public void setAmountUSD(Double amountUSD) {
        this.amountUSD = amountUSD;
    }

    /**
     * Gets the investment date.
     * 
     * @return the investment date
     */
    public Date getInvestmentDate() {
        return investmentDate;
    }

    /**
     * Sets the investment date.
     * 
     * @param investmentDate the investment date
     */
    public void setInvestmentDate(Date investmentDate) {
        this.investmentDate = investmentDate;
    }

    /**
     * Gets the person ID associated with the investment.
     * 
     * @return the person ID associated with the investment
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the person ID associated with the investment.
     * 
     * @param personId the person ID associated with the investment
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}