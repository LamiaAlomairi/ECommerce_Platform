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
@Table(name = "shippingAddresses")
public class ShippingAddresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String namePlace;
    String city;
    String country;

    @ManyToMany(mappedBy = "shippingAddresses")
    @JsonIgnore
    private List<User> users;
}
