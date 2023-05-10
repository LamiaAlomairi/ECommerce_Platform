package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Shipping_Addresses;
import com.ECommerce_Platform.ECommerce_Platform.Services.Shipping_Addresses_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "shipping_addresses")
public class Shipping_Addresses_Controller {
    //    http://localhost:8080/shipping_addresses/getAll
    @Autowired
    Shipping_Addresses_Service shipping_addresses_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Shipping_Addresses> getAllShipping_Addresses() {

        return shipping_addresses_service.getAllShipping_Addresses();
    }
    @GetMapping(value = "getById")
    public Shipping_Addresses getShipping_AddressesById(@RequestParam Long id) {

        return shipping_addresses_service.getShipping_AddressesById(id);
    }
}
