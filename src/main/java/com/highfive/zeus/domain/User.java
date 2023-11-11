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

@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String firstName;

    private String lastName;

    private String mail;

    private Date createdAt;

    @ManyToMany
    @JoinTable(name = "user_training",
                joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name="training_id", referencedColumnName = "id"))
    private List<Training> trainings;

    @ManyToMany
    @JoinTable(name = "user_benefit",
                joinColumns = @JoinColumn(name="user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name="benefit_id", referencedColumnName = "id"))
    private List<Benefit> benefits;
    
}
