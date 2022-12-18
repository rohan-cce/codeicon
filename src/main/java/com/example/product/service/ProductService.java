package com.example.product.service;


import com.example.product.document.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
    Product findProductById(String id);

    Product addProduct(Product product);

    interface ReviewService {
    }
}
