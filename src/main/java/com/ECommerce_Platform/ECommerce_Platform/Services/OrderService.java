package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Order;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {

        return orderRepository.findById(id).get();
    }
}
