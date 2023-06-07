package com.ECommerce_Platform.ECommerce_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double amount;
    String paymentMethod;
    Integer transactionId;
    Long userId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    Order order;

}
