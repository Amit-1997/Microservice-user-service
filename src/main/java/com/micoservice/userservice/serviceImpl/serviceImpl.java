package com.micoservice.userservice.serviceImpl;


import com.micoservice.userservice.entity.UserEntity;
import com.micoservice.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements UserService {

    // fake service
    List<UserEntity> userEntities=List.of(
            new UserEntity(1311L,"Amit", "123445555"),
            new UserEntity(1312L,"Ankit", "287867324"),
            new UserEntity(1313L,"Ram", "151525664")
    )
;
    @Override
    public UserEntity getUserByID(Long id) {
       UserEntity user= userEntities.stream().filter(e->e.getUserId().equals(id)).findAny().orElse(null);

       return user;
    }
}
