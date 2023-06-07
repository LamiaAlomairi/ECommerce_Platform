package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.ShoppingCart;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;
    public List<ShoppingCart> getAllShopping_Carts() {

        return shoppingCartRepository.findAll();
    }

    public ShoppingCart getShopping_CartById(Long id) {

        return shoppingCartRepository.findById(id).get();
    }
}
