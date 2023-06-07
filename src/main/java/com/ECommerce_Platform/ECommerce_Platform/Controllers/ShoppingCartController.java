package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.ShoppingCart;
import com.ECommerce_Platform.ECommerce_Platform.Services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "shopping_cart")
public class ShoppingCartController {
    //    http://localhost:8080/shopping_cart/getAll
    @Autowired
    ShoppingCartService shoppingCartService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShoppingCart> getAllShopping_Carts() {

        return shoppingCartService.getAllShopping_Carts();
    }
    @GetMapping(value = "getById")
    public ShoppingCart getShopping_CartById(@RequestParam Long id) {

        return shoppingCartService.getShopping_CartById(id);
    }
}
