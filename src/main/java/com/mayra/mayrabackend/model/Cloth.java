package com.mayra.mayrabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clothes")
@DiscriminatorValue("CLOTH")
public class Cloth extends Product {
    public enum ClothType { TROUSERS, SHIRT, SWEATER, OTHER }

    @Enumerated(EnumType.STRING)
    private ClothType type;
    private String size;
    private double height;
    private double weight;
    private int suggestedAge;

    // Constructors, getters, setters

    public Cloth(ClothType type, String size, double height, double weight, int suggestedAge) {
        super();
        this.type = type;
        this.size = size;
        this.height = height;
        this.weight = weight;
        this.suggestedAge = suggestedAge;
    }

    public ClothType getType() {
        return type;
    }

    public void setType(ClothType type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSuggestedAge() {
        return suggestedAge;
    }

    public void setSuggestedAge(int suggestedAge) {
        this.suggestedAge = suggestedAge;
    }
}
