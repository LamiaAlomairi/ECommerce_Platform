package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Shopping_Cart;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.Shopping_Cart_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shopping_Cart_Service {
    @Autowired
    Shopping_Cart_Repository shopping_cart_repository;
    public List<Shopping_Cart> getAllShopping_Carts() {

        return shopping_cart_repository.findAll();
    }

    public Shopping_Cart getShopping_CartById(Long id) {

        return shopping_cart_repository.findById(id).get();
    }
}
