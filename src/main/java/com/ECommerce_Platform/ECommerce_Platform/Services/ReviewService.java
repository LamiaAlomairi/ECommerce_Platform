package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Review;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public List<Review> getAllReviews() {

        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {

        return reviewRepository.findById(id).get();
    }
}
