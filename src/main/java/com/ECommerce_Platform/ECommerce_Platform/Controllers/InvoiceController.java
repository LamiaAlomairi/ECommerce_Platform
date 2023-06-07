package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Invoice;
import com.ECommerce_Platform.ECommerce_Platform.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "invoice")
public class InvoiceController {
    //    http://localhost:8080/invoice/getAll
    @Autowired
    InvoiceService invoiceService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Invoice> getAllInvoices() {

        return invoiceService.getAllInvoices();
    }
    @GetMapping(value = "getById")
    public Invoice getInvoiceById(@RequestParam Long id) {

        return invoiceService.getInvoiceById(id);
    }
}
