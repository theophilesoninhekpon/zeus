package com.highfive.zeus.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="benefit")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Benefit {
    
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private String description;

    @ManyToOne()
    @JoinColumn(name = "training", referencedColumnName = "id")
    private Training training;

    @ManyToMany(mappedBy = "benefits")
    private List<User> users;
    
    private Date createdAt;
    
}
