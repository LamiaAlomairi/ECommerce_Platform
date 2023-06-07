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
@Table(name = "usered")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String email;
    Integer phoneNumber;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Order> orders;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Invoice> invoices;

    @ManyToMany
    @JoinTable(name = "user_review", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "review_id"))
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(name = "user_shipping_addresses", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "address_id"))
    private List<ShippingAddresses> shippingAddresses;

    @ManyToMany
    @JoinTable(name = "user_shopping_cart", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "shopping_id"))
    private List<ShoppingCart> shoppingCarts;
}
