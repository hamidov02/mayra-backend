package com.mayrabackend.model;

import com.mayra.mayrabackend.model.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String username;
    private String address;
    private String phoneNumber;

    private Role role; // Single role for each user


    // Getters and setters

}
