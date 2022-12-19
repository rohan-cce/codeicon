package com.example.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.product.document.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
  User findByUserId(String userId);
}
