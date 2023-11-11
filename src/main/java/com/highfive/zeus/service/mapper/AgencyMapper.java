package com.highfive.zeus.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.highfive.zeus.domain.Agency;
import com.highfive.zeus.service.dto.AgencyDto;

@Mapper
public interface AgencyMapper {
    
    AgencyMapper INSTANCE = Mappers.getMapper(AgencyMapper.class);

    AgencyDto toDto(Agency agency);

    Agency toEntity(AgencyDto agencyDto);
    
}
