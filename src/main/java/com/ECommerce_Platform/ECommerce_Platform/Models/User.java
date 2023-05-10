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
@Table(name = "userr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long user_id;

    String name;
    String email;
    Integer phone_number;

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
    private List<Shipping_Addresses> shipping_addresses;

    @ManyToMany
    @JoinTable(name = "user_shopping_cart", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Shopping_Cart> shopping_carts;
}
