package com.mayra.mayrabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clothes")
public class Cloth extends Product {
    public enum ClothType { TROUSERS, SHIRT, SWEATER, OTHER }

    @Enumerated(EnumType.STRING)
    private ClothType type;
    private String size;
    private double height;
    private double weight;
    private int suggestedAge;

    // Constructors, getters, setters
}
