package com.example.investment.service;

import com.example.investment.dto.InvestmentDTO;
import com.example.investment.mapper.InvestmentMapper;
import com.example.investment.model.Investment;
import com.example.investment.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Service class for managing investments.
 */
@Service
@Transactional
public class InvestmentService {

    @Autowired
    private InvestmentRepository investmentRepository;

    @Autowired
    private InvestmentMapper investmentMapper;

    /**
     * Creates a new investment.
     *
     * @param investmentDTO the investment data transfer object
     * @return the created investment as a data transfer object
     */
    public InvestmentDTO createInvestment(InvestmentDTO investmentDTO) {
        Investment investment = investmentMapper.toEntity(investmentDTO);
        investment = investmentRepository.save(investment);
        return investmentMapper.toDto(investment);
    }

    /**
     * Retrieves a list of investments by person ID.
     *
     * @param personId the ID of the person
     * @return a list of investment data transfer objects
     */
    public List<InvestmentDTO> getInvestmentsByPersonId(Long personId) {
        return investmentMapper.toDtoList(investmentRepository.findByPersonId(personId));
    }

    /**
     * Calculates the total amount invested by a person.
     *
     * @param personId the ID of the person
     * @return the total amount invested in USD
     */
    public Double calculateTotalInvestedByPerson(Long personId) {
        return investmentRepository.findByPersonId(personId).stream().mapToDouble(Investment::getAmountUSD).sum();
    }

    /**
     * Updates an existing investment.
     *
     * @param id the ID of the investment to update
     * @param investmentDTO the investment data transfer object with updated values
     * @return the updated investment as a data transfer object
     */
    public InvestmentDTO updateInvestment(Long id, InvestmentDTO investmentDTO) {
        Investment investment = investmentMapper.toEntity(investmentDTO);
        investment.setId(id);
        investment = investmentRepository.save(investment);
        return investmentMapper.toDto(investment);
    }

    /**
     * Deletes an investment by its ID.
     *
     * @param id the ID of the investment to delete
     */
    public void deleteInvestment(Long id) {
        investmentRepository.deleteById(id);
    }
}