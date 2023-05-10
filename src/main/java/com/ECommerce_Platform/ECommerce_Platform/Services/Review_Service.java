package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Review;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.Review_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Review_Service {
    @Autowired
    Review_Repository review_repository;
    public List<Review> getAllReviews() {

        return review_repository.findAll();
    }

    public Review getReviewById(Long id) {

        return review_repository.findById(id).get();
    }
}
