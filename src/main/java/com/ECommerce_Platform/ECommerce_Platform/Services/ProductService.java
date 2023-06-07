package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Product;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public Product getProductById(Long id) {

        return productRepository.findById(id).get();
    }
}
