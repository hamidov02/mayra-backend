package com.mayra.mayrabackend.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CartItem> items = new HashSet<>();

    // If you want to link it to a registered user
    @OneToOne
    @JoinColumn(name = "user_id")
    private com.mayrabackend.model.User user;

    // Constructors, getters, and setters
}
