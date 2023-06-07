package com.ECommerce_Platform.ECommerce_Platform.Repositories;

import com.ECommerce_Platform.ECommerce_Platform.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
