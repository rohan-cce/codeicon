package com.example.product.service.impl;

import com.example.product.document.Product;
import com.example.product.model.ProductResponse;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductResponse<List<Product>> findAllProducts() {
        List<Product> productList = productRepository.findAll();
        ProductResponse productResponse = new ProductResponse();
        productResponse.setCode("200");
        productResponse.setValue(productList);
        return productResponse;
    }
    @Override
    public ProductResponse<Product> findProductById(String productId) {
        Product product = productRepository.findByProductId(productId);
        ProductResponse productResponse = new ProductResponse();
        productResponse.setCode("200");
        productResponse.setValue(product);
        return productResponse;
    }
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
