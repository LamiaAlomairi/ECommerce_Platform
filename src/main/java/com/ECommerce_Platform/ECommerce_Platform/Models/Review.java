package com.ECommerce_Platform.ECommerce_Platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long review_id;
    String titleOfReview;
    String textOfReview;
    String date;

}
