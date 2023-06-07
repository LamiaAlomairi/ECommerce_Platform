package com.ECommerce_Platform.ECommerce_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    Order order;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}
