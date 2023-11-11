package com.highfive.zeus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.zeus.domain.Benefit;

public interface BenefitRepository extends JpaRepository<Benefit, String>{
    
}
