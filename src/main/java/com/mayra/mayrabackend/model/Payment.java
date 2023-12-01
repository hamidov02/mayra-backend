package com.mayra.mayrabackend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private double amount;
    private String transactionId; // For storing Stripe transaction ID or similar

    private enum PaymentType { CASH, CREDIT_CARD }


    private enum PaymentStatus { PENDING, COMPLETED, FAILED, CANCELLED }
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;

    // Constructors, getters, and setters
}
