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
@Table(name = "orderr")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long order_id;

    Double price;
    String status;

    @OneToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    User user;

    @OneToMany(mappedBy = "order")
    @JsonIgnore
    private List<Payment> payments;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    Product product;
}
