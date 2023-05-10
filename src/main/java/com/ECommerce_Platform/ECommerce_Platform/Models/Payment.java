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
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long payment_id;
    Double amount;
    String payment_method;
    Integer transaction_id;
    Long user_id;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    Order order;

}
