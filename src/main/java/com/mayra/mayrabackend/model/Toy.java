package com.mayra.mayrabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "toys")
@DiscriminatorValue("TOY")
public class Toy extends Product {
    private int minAge;
    private String size;
    // Other specific fields

    public Toy(int minAge, String size) {
        super();
        this.minAge = minAge;
        this.size = size;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Constructors, getters, setters
}
