package com.micoservice.userservice.service;


import com.micoservice.userservice.entity.UserEntity;
import org.apache.tomcat.util.log.UserDataHelper;

public interface UserService {


    public UserEntity getUserByID(Long id);

}
