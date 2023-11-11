package com.highfive.zeus.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="training")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Training {
    
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private String description;

    private int duration;

    @ManyToMany(mappedBy = "trainings")
    private List<User> users;

    @ManyToMany(mappedBy = "trainings")
    private List<Agency> agencies;

    @OneToMany(mappedBy = "training")
    private List<Benefit> benefits;

    private Date createdAt;
    
}
