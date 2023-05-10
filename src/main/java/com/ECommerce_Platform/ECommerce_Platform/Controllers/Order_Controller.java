package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Order;
import com.ECommerce_Platform.ECommerce_Platform.Services.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class Order_Controller {
    //    http://localhost:8080/order/getAll
    @Autowired
    Order_Service order_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Order> getAllOrders() {

        return order_service.getAllOrders();
    }
    @GetMapping(value = "getById")
    public Order getOrderById(@RequestParam Long id) {

        return order_service.getOrderById(id);
    }
}
