package com.highfive.zeus.service;

import java.util.List;

import com.highfive.zeus.domain.User;


public interface UserService {
    
    /*
     * Retrieve an user
     */
    User getUserById(String userId);

    /*
     * Retrieve all agencies
     */
    List<User> getAllUsers();

    /**
     * Create an user
     */
    User createUser(User user);

    /*
     * Update an user
     */
    User updateUser(User user);

    /*
     * Delete an user
     */
    void delete(String userId);
    
}
