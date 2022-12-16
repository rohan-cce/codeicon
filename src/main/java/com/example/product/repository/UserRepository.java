package com.example.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.product.document.User;

public interface UserRepository extends MongoRepository<User, String> {
  User findByUserId(String userId);
}
