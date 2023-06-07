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
@Table(name = "shoppingCart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long cartId;
    String creatingCartDate;
    String updatedCartDate;

    @ManyToMany(mappedBy = "shoppingCarts")
    @JsonIgnore
    private List<Product> products;

    @ManyToMany(mappedBy = "shoppingCarts")
    @JsonIgnore
    private List<User> users;
}
