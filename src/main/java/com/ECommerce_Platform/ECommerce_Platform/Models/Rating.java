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
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long rating_id;
    String rating;

    @ManyToMany(mappedBy = "ratings")
    @JsonIgnore
    private List<Product> products;
}
