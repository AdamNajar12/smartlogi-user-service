package com.example.userservice.Model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
   @Id
    private String id;
    private String name;
   private String email;
   private  String password;
  private Role UserRole;
}
