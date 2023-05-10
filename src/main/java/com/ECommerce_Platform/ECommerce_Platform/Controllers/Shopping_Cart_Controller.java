package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Shopping_Cart;
import com.ECommerce_Platform.ECommerce_Platform.Services.Shopping_Cart_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "shopping_cart")
public class Shopping_Cart_Controller {
    //    http://localhost:8080/shopping_cart/getAll
    @Autowired
    Shopping_Cart_Service shopping_cart_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Shopping_Cart> getAllShopping_Carts() {

        return shopping_cart_service.getAllShopping_Carts();
    }
    @GetMapping(value = "getById")
    public Shopping_Cart getShopping_CartById(@RequestParam Long id) {

        return shopping_cart_service.getShopping_CartById(id);
    }
}
