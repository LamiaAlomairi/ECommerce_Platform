package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Product;
import com.ECommerce_Platform.ECommerce_Platform.Services.Product_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class Product_Controller {
    //    http://localhost:8080/product/getAll
    @Autowired
    Product_Service product_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Product> getAllProducts() {

        return product_service.getAllProducts();
    }
    @GetMapping(value = "getById")
    public Product getProductById(@RequestParam Long id) {

        return product_service.getProductById(id);
    }
}
