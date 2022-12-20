package com.example.product.repository;

import com.example.product.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

  Category findByCategoryId(String categoryId);

  Category findByProductId(String productId);

  Optional<Category> findByCategoryIdAndProductId(String categoryId, String productId);



}
