package com.ECommerce_Platform.ECommerce_Platform.Repositories;

import com.ECommerce_Platform.ECommerce_Platform.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
