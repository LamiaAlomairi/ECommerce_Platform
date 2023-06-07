package com.ECommerce_Platform.ECommerce_Platform.Services;

import com.ECommerce_Platform.ECommerce_Platform.Models.Rating;
import com.ECommerce_Platform.ECommerce_Platform.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;
    public List<Rating> getAllRatings() {

        return ratingRepository.findAll();
    }

    public Rating getRatingById(Long id) {

        return ratingRepository.findById(id).get();
    }
}
