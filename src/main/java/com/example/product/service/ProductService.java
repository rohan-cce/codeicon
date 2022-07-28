package com.example.product.service;


import com.example.product.document.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
   Product save(Product product);
   void deleteById(int id);
//    Product findLastId();

}
