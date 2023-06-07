package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.ShippingAddresses;
import com.ECommerce_Platform.ECommerce_Platform.Services.ShippingAddressesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "shippingAddresses")
public class ShippingAddressesController {
    //    http://localhost:8080/shipping_addresses/getAll
    @Autowired
    ShippingAddressesService shippingAddressesService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShippingAddresses> getAllShipping_Addresses() {

        return shippingAddressesService.getAllShipping_Addresses();
    }
    @GetMapping(value = "getById")
    public ShippingAddresses getShipping_AddressesById(@RequestParam Long id) {

        return shippingAddressesService.getShipping_AddressesById(id);
    }
}
