package com.mayra.mayrabackend.service;

import com.mayra.mayrabackend.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    // Business logic methods for OrderItem (e.g., create, find, update, delete)
    // ...
}
