package com.example.demo.service;

import com.example.demo.persistence.entity.User;
import com.example.demo.persistence.repository.UserRepository;
import com.example.demo.presentor.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserDto userDto) {
        userRepository.save(new User(userDto.getName()));
    }

    public User getUser(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }
}
