package com.micoservice.userservice.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserEntity {

    private Long userId;
    private String name;
    private String phone;

    List<Contacts> contacts=new ArrayList<>();

    public UserEntity(Long userId, String name, String phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }
}
