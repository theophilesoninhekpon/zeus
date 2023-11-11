package com.highfive.zeus.service.dto;

import com.highfive.zeus.domain.Training;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgencyDto {
    
    private String id;

    private String name;

    private String description;

    private String mail;

    private String manager;

    private List<Training> trainings;
    
    private Date createdAt;

}
