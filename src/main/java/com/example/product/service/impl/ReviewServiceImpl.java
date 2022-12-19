package com.example.product.service.impl;

import com.example.product.document.Category;
import com.example.product.document.Recommendation;
import com.example.product.model.AddReviewRequest;
import com.example.product.repository.CategoryRepository;
import com.example.product.repository.ReviewRepository;
import com.example.product.service.ReviewService;
import com.example.product.document.Tag;
import com.example.product.document.TagReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category findAllReviews(String category) {
        return categoryRepository.findByCategoryId(category);
    }

    @Override
    public void addReview(AddReviewRequest addReviewRequest) {
        String productId = addReviewRequest.getProductId();
        Category category = categoryRepository.findByProductId(productId);
        category.setId(category.getId());
        for (Tag tag: category.getTagList()) {
            for (TagReview tagReview: addReviewRequest.getTagList()) {
                if(tag.getTagName().equalsIgnoreCase(tagReview.getTagName())) {
                    if (Objects.nonNull(tagReview.getIsLiked())){
                        if (tagReview.getIsLiked()) {
                            tag.setLikes(tag.getLikes() + 1);
//                            if (tag.getLikes() >= tag.getDislikes()) {
//                                tag.setRecommended(true);
//                            } else {
//                                tag.setRecommended(false);
//                            }
                        } else {
                            tag.setDislikes(tag.getDislikes() + 1);
//                            if (tag.getLikes() >= tag.getDislikes()) {
//                                tag.setRecommended(true);
//                            } else {
//                                tag.setRecommended(false);
//                            }
                        }
                        if (tag.getLikes() >= tag.getDislikes()) {
                            tag.setRecommended(true);
                        } else {
                            tag.setRecommended(false);
                        }
                }
                    break;
                }
            }
        }
        category.setTextReview(addReviewRequest.getTextReview());
        categoryRepository.save(category);
    }
}
