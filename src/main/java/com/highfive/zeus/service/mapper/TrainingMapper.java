package com.highfive.zeus.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.highfive.zeus.domain.Training;
import com.highfive.zeus.service.dto.TrainingDto;

@Mapper
public interface TrainingMapper {
    
    TrainingMapper INSTANCE = Mappers.getMapper(TrainingMapper.class);

    TrainingDto toDto(Training training);

    Training toEntity(TrainingDto trainingDto);

}
