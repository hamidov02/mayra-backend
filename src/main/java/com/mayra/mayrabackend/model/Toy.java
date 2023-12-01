package com.mayra.mayrabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "toys")
public class Toy extends Product {
    private int minAge;
    private String size;
    // Other specific fields

    // Constructors, getters, setters
}
