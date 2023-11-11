package com.highfive.zeus.service.dto;

import java.util.Date;
import java.util.List;

import com.highfive.zeus.domain.Agency;
import com.highfive.zeus.domain.Benefit;
import com.highfive.zeus.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainingDto {
    
    private String id;

    private String name;

    private String description;

    private int duration;

    private List<User> users;

    private List<Agency> agencies;

    private List<Benefit> benefits;

    private Date createdAt;

}
