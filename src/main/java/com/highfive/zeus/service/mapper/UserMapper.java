package com.highfive.zeus.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.highfive.zeus.domain.User;
import com.highfive.zeus.service.dto.UserDto;

@Mapper
public interface UserMapper {
    
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
    
}
