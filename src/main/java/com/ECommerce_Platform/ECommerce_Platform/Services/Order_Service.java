package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Order;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.Order_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_Service {
    @Autowired
    Order_Repository order_repository;
    public List<Order> getAllOrders() {

        return order_repository.findAll();
    }

    public Order getOrderById(Long id) {

        return order_repository.findById(id).get();
    }
}
