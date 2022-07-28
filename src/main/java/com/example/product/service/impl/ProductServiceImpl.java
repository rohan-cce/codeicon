package com.example.product.service.impl;

import com.example.product.document.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        Product product = mongoTemplate.findById(id,Product.class);
        return product;
    }

    @Override
    public Product save(Product product) {

        return mongoTemplate.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

//    @Override
//    public Product findLastId(){
//        return productRepository.findLastId();
//    }

}
