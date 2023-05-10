package com.ECommerce_Platform.ECommerce_Platform.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "shipping_addresses")
public class Shipping_Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long address_id;
    String name_place;
    String city;
    String country;

    @ManyToMany(mappedBy = "shipping_addresses")
    @JsonIgnore
    private List<User> users;
}
