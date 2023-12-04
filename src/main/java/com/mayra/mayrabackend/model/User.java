package com.mayra.mayrabackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    private String fullname;

    @NotNull
    @Size(min = 10, max = 15)
    private String phone;

    @NotNull
    @Email
    private String email;

    private String address;

    @NotNull
    @Size(min = 4, max = 50)
    private String username;

    @NotNull
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToOne(mappedBy = "user")
    private ShoppingCart shoppingCart;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image profilePicture;
}
