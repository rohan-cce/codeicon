package com.example.product.controller;

import com.example.product.document.Category;
import com.example.product.document.Recommendation;
import com.example.product.model.AddReviewRequest;
import com.example.product.model.ApiPath;
import com.example.product.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiPath.REVIEWS)
public class ReviewController {

    @Autowired
    ReviewService reviewService;
    /*

    clothing
        material
        stitching
        comfortness
        colour

    * */

    @GetMapping(value = ApiPath.VIEW_ALL_REVIEWS)
    public Category getAllReviews(@RequestParam String categoryId){
        return reviewService.findAllReviews(categoryId);
    }

    @PostMapping(value = ApiPath.ADD_REVIEW)
    public void addReview(@RequestBody AddReviewRequest addReviewRequest){
        reviewService.addReview(addReviewRequest);
    }
}
