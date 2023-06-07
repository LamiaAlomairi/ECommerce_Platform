package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.ShippingAddresses;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.ShippingAddressesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressesService {
    @Autowired
    ShippingAddressesRepository shippingAddressesRepository;
    public List<ShippingAddresses> getAllShipping_Addresses() {

        return shippingAddressesRepository.findAll();
    }

    public ShippingAddresses getShipping_AddressesById(Long id) {

        return shippingAddressesRepository.findById(id).get();
    }
}
