package com.mayrabackend.model;

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

    private enum Role { ADMIN, REGISTERED_USER, SUBSCRIBER }


    // Getters and setters

}
