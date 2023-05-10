package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Product;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.Product_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_Service {
    @Autowired
    Product_Repository product_repository;
    public List<Product> getAllProducts() {

        return product_repository.findAll();
    }

    public Product getProductById(Long id) {

        return product_repository.findById(id).get();
    }
}
