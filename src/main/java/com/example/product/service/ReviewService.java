package com.example.product.service;

import com.example.product.document.Category;
import com.example.product.document.Recommendation;
import com.example.product.model.AddReviewRequest;
import com.example.product.model.CommentResponse;
import com.example.product.model.TagResponse;
import java.util.List;

public interface ReviewService {
    Category findAllReviews(String category);

    public void addReview(AddReviewRequest addReviewRequest);

    public CommentResponse getReviewComments(String productId);
}
