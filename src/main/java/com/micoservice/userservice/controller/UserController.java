package com.micoservice.userservice.controller;


import com.micoservice.userservice.entity.Contacts;
import com.micoservice.userservice.entity.UserEntity;
import com.micoservice.userservice.serviceImpl.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private serviceImpl service;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("{id}")
    public UserEntity getUserById(@PathVariable Long id)
    {
       UserEntity user= service.getUserByID(id);
       // http://localhost:9002/contact/user/1311
        List<Contacts> contacts=restTemplate.getForObject("http://localhost:9002/contact/user/"+id, List.class);
        user.setContacts(contacts);
        return user;
    }
 }
