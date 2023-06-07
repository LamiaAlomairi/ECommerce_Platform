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
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titleOfReview;
    String textOfReview;
    String date;
    Integer rating;

    @ManyToMany(mappedBy = "reviews")
    @JsonIgnore
    private List<Product> products;

    @ManyToMany(mappedBy = "reviews")
    @JsonIgnore
    private List<User> users;
}
