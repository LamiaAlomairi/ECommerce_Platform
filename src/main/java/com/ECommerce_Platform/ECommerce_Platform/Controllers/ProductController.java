package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Product;
import com.ECommerce_Platform.ECommerce_Platform.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    //    http://localhost:8080/product/getAll
    @Autowired
    ProductService productService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }
    @GetMapping(value = "getById")
    public Product getProductById(@RequestParam Long id) {

        return productService.getProductById(id);
    }
}
