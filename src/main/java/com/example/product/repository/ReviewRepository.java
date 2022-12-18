package com.example.product.repository;

import com.example.product.document.Recommendation;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository {
    Recommendation getAll();
}
