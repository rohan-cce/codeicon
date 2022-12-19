package com.example.product.service;


import com.example.product.document.Product;
import com.example.product.model.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse findAllProducts();
    ProductResponse findProductById(String id);

    Product addProduct(Product product);

    interface ReviewService {
    }
}
