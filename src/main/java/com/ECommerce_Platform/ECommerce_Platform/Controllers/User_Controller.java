package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.User;
import com.ECommerce_Platform.ECommerce_Platform.Services.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class User_Controller {
    //    http://localhost:8080/user/getAll
    @Autowired
    User_Service user_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        return user_service.getAllUsers();
    }
    @GetMapping(value = "getById")
    public User getUserById(@RequestParam Long id) {

        return user_service.getUserById(id);
    }
}
