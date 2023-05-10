package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Review;
import com.ECommerce_Platform.ECommerce_Platform.Services.Review_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class Review_Controller {
    //    http://localhost:8080/review/getAll
    @Autowired
    Review_Service review_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReviews() {

        return review_service.getAllReviews();
    }
    @GetMapping(value = "getById")
    public Review getReviewById(@RequestParam Long id) {

        return review_service.getReviewById(id);
    }
}
