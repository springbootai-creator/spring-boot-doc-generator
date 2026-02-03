package com.example.investment.mapper;

import com.example.investment.dto.InvestmentDTO;
import com.example.investment.model.Investment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

/**
 * Mapper interface for converting between Investment and InvestmentDTO objects.
 */
@Mapper(componentModel = "spring")
public interface InvestmentMapper {

    /**
     * Instance of the InvestmentMapper.
     */
    InvestmentMapper INSTANCE = Mappers.getMapper(InvestmentMapper.class);

    /**
     * Converts an Investment entity to an InvestmentDTO.
     *
     * @param investment the Investment entity to convert
     * @return the converted InvestmentDTO
     */
    InvestmentDTO toDto(Investment investment);

    /**
     * Converts an InvestmentDTO to an Investment entity.
     *
     * @param investmentDTO the InvestmentDTO to convert
     * @return the converted Investment entity
     */
    Investment toEntity(InvestmentDTO investmentDTO);

    /**
     * Converts a list of Investment entities to a list of InvestmentDTOs.
     *
     * @param investments the list of Investment entities to convert
     * @return the list of converted InvestmentDTOs
     */
    List<InvestmentDTO> toDtoList(List<Investment> investments);
}