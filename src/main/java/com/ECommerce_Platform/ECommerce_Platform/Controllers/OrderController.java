package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Order;
import com.ECommerce_Platform.ECommerce_Platform.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderController {
    //    http://localhost:8080/order/getAll
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Order> getAllOrders() {

        return orderService.getAllOrders();
    }
    @GetMapping(value = "getById")
    public Order getOrderById(@RequestParam Long id) {

        return orderService.getOrderById(id);
    }
}
