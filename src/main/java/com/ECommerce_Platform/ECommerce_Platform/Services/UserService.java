package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.User;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public User getUserById(Long id) {

        return userRepository.findById(id).get();
    }
}
