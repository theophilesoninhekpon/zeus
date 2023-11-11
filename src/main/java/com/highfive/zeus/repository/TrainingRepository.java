package com.highfive.zeus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.zeus.domain.Training;

public interface TrainingRepository extends JpaRepository<Training, String>{
    
}
