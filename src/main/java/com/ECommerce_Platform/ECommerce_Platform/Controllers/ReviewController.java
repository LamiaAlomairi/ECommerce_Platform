package com.ECommerce_Platform.ECommerce_Platform.Controllers;

import com.ECommerce_Platform.ECommerce_Platform.Models.Review;
import com.ECommerce_Platform.ECommerce_Platform.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class ReviewController {
    //    http://localhost:8080/review/getAll
    @Autowired
    ReviewService reviewService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getAllReviews() {

        return reviewService.getAllReviews();
    }
    @GetMapping(value = "getById")
    public Review getReviewById(@RequestParam Long id) {

        return reviewService.getReviewById(id);
    }
}
