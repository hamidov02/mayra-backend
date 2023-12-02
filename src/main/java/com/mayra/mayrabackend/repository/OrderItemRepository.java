package com.mayra.mayrabackend.repository;

import com.mayra.mayrabackend.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // Additional custom query methods can be added here if needed
}
