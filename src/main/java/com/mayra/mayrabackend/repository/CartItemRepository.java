package com.mayra.mayrabackend.repository;

import com.mayra.mayrabackend.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // Additional custom query methods can be added here if needed
}

