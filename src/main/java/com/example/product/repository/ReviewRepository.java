package com.example.product.repository;

import com.example.product.document.Recommendation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<Recommendation, String> {
    List<Recommendation> findAll();
}
