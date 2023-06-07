package com.ECommerce_Platform.ECommerce_Platform.Repositories;

import com.ECommerce_Platform.ECommerce_Platform.Models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
