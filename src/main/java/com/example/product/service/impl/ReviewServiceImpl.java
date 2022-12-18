package com.example.product.service.impl;

import com.example.product.document.Recommendation;
import com.example.product.repository.ReviewRepository;
import com.example.product.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;

public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public Recommendation findAllReviews() {
        return reviewRepository.getAll();
    }
}
