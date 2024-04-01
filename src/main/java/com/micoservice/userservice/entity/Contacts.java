package com.micoservice.userservice.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Contacts {

      private Long cId;
      private String email;
      private String contactName;
      private Long userId;
}
