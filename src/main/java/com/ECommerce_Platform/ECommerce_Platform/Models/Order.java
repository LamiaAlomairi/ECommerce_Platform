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
@Table(name = "ordered")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double price;
    String status;

    @OneToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
    Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;

    @OneToMany(mappedBy = "order")
    @JsonIgnore
    private List<Payment> payments;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    Product product;
}
