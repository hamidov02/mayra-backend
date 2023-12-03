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

    public PaymentDetail(Long id, Payment payment, String cardType, String cardLastFourDigits, String cardExpirationDate) {
        this.id = id;
        this.payment = payment;
        this.cardType = cardType;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardExpirationDate = cardExpirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLastFourDigits() {
        return cardLastFourDigits;
    }

    public void setCardLastFourDigits(String cardLastFourDigits) {
        this.cardLastFourDigits = cardLastFourDigits;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    // Constructors, getters, and setters
}
