package com.mayra.mayrabackend.repository;

import com.mayra.mayrabackend.model.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailRepository extends JpaRepository<PaymentDetail, Long> {
    // Custom query methods can be added here
}
