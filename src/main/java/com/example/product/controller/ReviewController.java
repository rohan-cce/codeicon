package com.example.product.controller;

import com.example.product.document.Recommendation;
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
    public Recommendation getAllReviews(){
        return reviewService.findAllReviews();
    }

    @PostMapping(value = ApiPath.ADD_REVIEW)
    public addReview(@RequestBody Recommendation recommendation){

    }
}
