package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Shipping_Addresses;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.Shipping_Addresses_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shipping_Addresses_Service {
    @Autowired
    Shipping_Addresses_Repository shipping_addresses_repository;
    public List<Shipping_Addresses> getAllShipping_Addresses() {

        return shipping_addresses_repository.findAll();
    }

    public Shipping_Addresses getShipping_AddressesById(Long id) {

        return shipping_addresses_repository.findById(id).get();
    }
}
