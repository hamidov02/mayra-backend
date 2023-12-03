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

    public Payment(Long id, Order order, double amount, String transactionId, Date paymentDate) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.transactionId = transactionId;
        this.paymentDate = paymentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    // Constructors, getters, and setters
}
