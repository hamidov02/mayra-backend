package com.mayra.mayrabackend.model;

import com.mayrabackend.model.User;
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

    public ShoppingCart(Long id, Set<CartItem> items, User user) {
        this.id = id;
        this.items = items;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<CartItem> getItems() {
        return items;
    }

    public void setItems(Set<CartItem> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Constructors, getters, and setters
}
