package com.mayra.mayrabackend.repository;

import com.mayra.mayrabackend.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    // Additional custom query methods can be added here if needed
}
