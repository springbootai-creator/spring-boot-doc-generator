package com.example.investment.repository;

import com.example.investment.model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Repository interface for managing Investment entities.
 */
@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {

    /**
     * Finds a list of investments by the given person ID.
     *
     * @param personId the ID of the person whose investments are to be retrieved
     * @return a list of investments associated with the specified person ID
     */
    List<Investment> findByPersonId(Long personId);
}