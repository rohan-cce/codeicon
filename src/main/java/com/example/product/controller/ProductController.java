package com.example.product.controller;


import com.example.product.document.Product;
import com.example.product.model.ApiPath;
import com.example.product.model.ProductResponse;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = ApiPath.API)
@CrossOrigin(value = "*")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping(value = ApiPath.VIEW_ALL_PRODUCTS)
    public ProductResponse<List<Product>> findAllProducts(){
        return productService.findAllProducts();
    }
    @GetMapping(value = ApiPath.VIEW_PRODUCT)
    public ProductResponse<Product> findSpecificProduct(@PathVariable("id") String id){
        return productService.findProductById(id);
    }
    @PostMapping(value = ApiPath.ADD_PRODUCT)
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
