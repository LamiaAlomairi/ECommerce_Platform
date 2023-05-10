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
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long product_id;
    String name;
    String description;
    Double price;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Order> orders;

    @ManyToMany
    @JoinTable(name = "product_rating", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "rating_id"))
    private List<Rating> ratings;

    @ManyToMany
    @JoinTable(name = "product_review", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "review_id"))
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(name = "product_shopping_cart", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Shopping_Cart> shopping_carts;
}
