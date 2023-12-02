package com.mayra.mayrabackend.service;

import com.mayra.mayrabackend.model.PaymentDetail;
import com.mayra.mayrabackend.repository.PaymentDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentDetailService {

    private final PaymentDetailRepository paymentDetailRepository;

    @Autowired
    public PaymentDetailService(PaymentDetailRepository paymentDetailRepository) {
        this.paymentDetailRepository = paymentDetailRepository;
    }

    public List<PaymentDetail> findAllPaymentDetails() {
        return paymentDetailRepository.findAll();
    }

    public Optional<PaymentDetail> findPaymentDetailById(Long id) {
        return paymentDetailRepository.findById(id);
    }

    public PaymentDetail createPaymentDetail(PaymentDetail paymentDetail) {
        return paymentDetailRepository.save(paymentDetail);
    }

    public PaymentDetail updatePaymentDetail(Long id, PaymentDetail paymentDetailDetails) {
        return paymentDetailRepository.findById(id)
                .map(paymentDetail -> {
                    // Update necessary fields
                    return paymentDetailRepository.save(paymentDetail);
                })
                .orElseGet(() -> {
                    paymentDetailDetails.setId(id);
                    return paymentDetailRepository.save(paymentDetailDetails);
                });
    }

    public void deletePaymentDetail(Long id) {
        paymentDetailRepository.deleteById(id);
    }
}
