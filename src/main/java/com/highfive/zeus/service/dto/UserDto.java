package com.highfive.zeus.service.dto;

import java.util.Date;
import java.util.List;

import com.highfive.zeus.domain.Benefit;
import com.highfive.zeus.domain.Training;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    
    private String id;

    private String firstName;

    private String lastName;

    private String mail;

    private Date createdAt;

    private List<Training> trainings;

    private List<Benefit> benefits;

}
