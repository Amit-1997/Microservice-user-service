package com.micoservice.userservice.controller;


import com.micoservice.userservice.entity.UserEntity;
import com.micoservice.userservice.serviceImpl.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private serviceImpl service;

    @GetMapping("{id}")
    public UserEntity getUserById(@PathVariable Long id)
    {
        return service.getUserByID(id);
    }
 }
