package com.highfive.zeus.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="agency")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Agency {
    
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private String description;

    private String mail;

    private String manager;

    @ManyToMany
    @JoinTable(name = "agency_training",
                joinColumns = @JoinColumn(name="agency_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name="training_id", referencedColumnName = "id"))
    private List<Training> trainings;

    private Date createdAt;
    
}



