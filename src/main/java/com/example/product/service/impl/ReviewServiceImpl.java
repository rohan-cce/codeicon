package com.example.product.service.impl;

import com.example.product.document.Recommendation;
import com.example.product.repository.ReviewRepository;
import com.example.product.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public List<Recommendation> findAllReviews() {
        return reviewRepository.findAll();
    }
}
