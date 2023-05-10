package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Invoice;
import com.ECommerce_Platform.ECommerce_Platform.Services.Invoice_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "invoice")
public class Invoice_Controller {
    //    http://localhost:8080/invoice/getAll
    @Autowired
    Invoice_Service invoice_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Invoice> getAllInvoices() {

        return invoice_service.getAllInvoices();
    }
    @GetMapping(value = "getById")
    public Invoice getInvoiceById(@RequestParam Long id) {

        return invoice_service.getInvoiceById(id);
    }
}
