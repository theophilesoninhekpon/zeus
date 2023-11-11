package com.highfive.zeus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highfive.zeus.domain.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
