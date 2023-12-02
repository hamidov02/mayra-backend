package com.mayra.mayrabackend.repository;

import com.mayra.mayrabackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional custom query methods can be added here if needed
}
