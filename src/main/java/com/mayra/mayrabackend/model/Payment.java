package com.mayra.mayrabackend.model;

import com.mayra.mayrabackend.model.enums.PaymentStatus;
import com.mayra.mayrabackend.model.enums.PaymentType;
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

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;

    // Constructors, getters, and setters
}
