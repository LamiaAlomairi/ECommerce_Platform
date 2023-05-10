package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Invoice;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.Invoice_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Invoice_Service {
    @Autowired
    Invoice_Repository invoice_repository;
    public List<Invoice> getAllInvoices() {

        return invoice_repository.findAll();
    }

    public Invoice getInvoiceById(Long id) {

        return invoice_repository.findById(id).get();
    }
}
