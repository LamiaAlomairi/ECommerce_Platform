package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Invoice;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    public List<Invoice> getAllInvoices() {

        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(Long id) {

        return invoiceRepository.findById(id).get();
    }
}
