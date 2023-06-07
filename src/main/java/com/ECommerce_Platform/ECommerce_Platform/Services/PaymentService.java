package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Payment;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public List<Payment> getAllPayments() {

        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id) {

        return paymentRepository.findById(id).get();
    }
}
