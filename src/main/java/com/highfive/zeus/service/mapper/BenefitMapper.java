package com.highfive.zeus.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.highfive.zeus.domain.Benefit;
import com.highfive.zeus.service.dto.BenefitDto;

@Mapper
public interface BenefitMapper {
    
    BenefitMapper INSTANCE = Mappers.getMapper(BenefitMapper.class);

    BenefitDto toDto(Benefit benefit);

    Benefit toEntity(BenefitDto benefitDto);

}
