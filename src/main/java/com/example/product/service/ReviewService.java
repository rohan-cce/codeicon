package com.example.product.service;

import com.example.product.document.Recommendation;

import java.util.List;

public interface ReviewService {
    List<Recommendation> findAllReviews();
}
