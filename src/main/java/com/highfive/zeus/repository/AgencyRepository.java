package com.highfive.zeus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.zeus.domain.Agency;

public interface AgencyRepository extends JpaRepository<Agency, String>{
    
}
