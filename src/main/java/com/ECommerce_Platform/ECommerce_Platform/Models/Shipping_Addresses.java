package com.ECommerce_Platform.ECommerce_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "shipping_addresses")
public class Shipping_Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long shipping_id;

}
