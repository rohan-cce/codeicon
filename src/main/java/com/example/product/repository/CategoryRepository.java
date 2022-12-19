package com.example.product.repository;

import com.example.product.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

  String UPCOMING_APPROVED_ORDERS_QUERY = "{categoryId:?0,tagList.tagName:?1}";
  Category findByCategoryId(String categoryId);

  @Query(value = UPCOMING_APPROVED_ORDERS_QUERY)
  Category getTagByTagName(String categoryId, String tagName);


}
