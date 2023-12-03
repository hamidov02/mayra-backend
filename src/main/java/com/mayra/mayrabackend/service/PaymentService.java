package com.mayra.mayrabackend.service;

import com.mayra.mayrabackend.model.Payment;
import com.mayra.mayrabackend.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> findAllPayments() {
        return paymentRepository.findAll();
    }

    public Optional<Payment> findPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment updatePayment(Long id, Payment paymentDetails) {
        return paymentRepository.findById(id)
                .map(payment -> {
                    // Update necessary fields
                    return paymentRepository.save(payment);
                })
                .orElseGet(() -> {
                    paymentDetails.setId(id);
                    return paymentRepository.save(paymentDetails);
                });
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
