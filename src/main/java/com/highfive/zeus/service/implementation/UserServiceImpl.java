package com.highfive.zeus.service.implementation;

import java.util.List;

import com.highfive.zeus.domain.User;
import com.highfive.zeus.repository.UserRepository;
import com.highfive.zeus.service.UserService;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        
        return this.userRepository.findAll();

    }

    @Override
    public User getUserById(String userId) {
        
        return this.userRepository.findById(userId).orElse(null);

    }

    @Override
    public User createUser(User user) {
        
        return this.userRepository.save(user);
        
    }

    @Override
    public User updateUser(User user) {
        
        User existingUser = this.userRepository.findById(user.getId()).orElse(null);

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setMail(user.getMail());
        existingUser.setCreatedAt(user.getCreatedAt());
        if(user.)
        existingUser.setBenefits(user.getBenefits());
        existingUser.setTrainings(user.getTrainings());

        return this.userRepository.save(existingUser);

    }

    @Override
    public void delete(String userId) {
        
        this.userRepository.deleteById(userId);
        
    }

    
}
