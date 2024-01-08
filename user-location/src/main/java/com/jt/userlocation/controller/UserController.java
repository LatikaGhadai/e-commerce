package com.jt.userlocation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.userlocation.entity.UserLocation;
import com.jt.userlocation.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create_data")
    public UserLocation saveUser(@RequestBody UserLocation userLocation) {
        UserLocation savedUser = userService.createUser(userLocation);
        return savedUser;
    }
    
    @GetMapping("/retrive")
    public List<UserLocation> getAllUser(){
    	List<UserLocation> all = userService.getAll();
    	return all;
    }
}

