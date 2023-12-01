package com.mayra.mayrabackend.model;

import jakarta.persistence.*;

@Entity
public class PaymentDetail{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private String cardType;
    private String cardLastFourDigits;
    private String cardExpirationDate;

    // Constructors, getters, and setters
}
