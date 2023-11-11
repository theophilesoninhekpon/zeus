package com.highfive.zeus.service.dto;

import java.util.Date;
import java.util.List;

import com.highfive.zeus.domain.Training;
import com.highfive.zeus.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BenefitDto {
    
    private String id;

    private String name;

    private String description;

    private Training training;

    private List<User> users;
    
    private Date createdAt;

}
