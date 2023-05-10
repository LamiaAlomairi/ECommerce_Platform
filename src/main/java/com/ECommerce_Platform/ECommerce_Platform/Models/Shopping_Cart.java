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
@Table(name = "shopping_cart")
public class Shopping_Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long cart_id;
    String creating_cart_date;
    String updated_cart_date;

    @ManyToMany(mappedBy = "shopping_carts")
    @JsonIgnore
    private List<Product> products;

    @ManyToMany(mappedBy = "shopping_carts")
    @JsonIgnore
    private List<User> users;
}
