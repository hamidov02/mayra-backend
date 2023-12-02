package com.mayra.mayrabackend.service;

import com.mayra.mayrabackend.model.Order;
import com.mayra.mayrabackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> findOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order orderDetails) {
        return orderRepository.findById(id)
                .map(order -> {
                    order.setItems(orderDetails.getItems());
                    order.setUser(orderDetails.getUser());
                    order.setOrderDate(orderDetails.getOrderDate());
                    order.setTotalAmount(orderDetails.getTotalAmount());
                    order.setShippingAddress(orderDetails.getShippingAddress());
                    order.setCreatedAt(orderDetails.getCreatedAt());
                    order.setUpdatedAt(orderDetails.getUpdatedAt());
                    // Update other fields as necessary
                    return orderRepository.save(order);
                })
                .orElseGet(() -> {
                    orderDetails.setId(id);
                    return orderRepository.save(orderDetails);
                });
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
