package com.example.product.service;

import com.example.product.document.Category;
import com.example.product.document.Recommendation;
import com.example.product.model.AddReviewRequest;

public interface ReviewService {
    Category findAllReviews(String category);

    public void addReview(AddReviewRequest addReviewRequest);
}
