package com.example.product.controller;


import com.example.product.document.Product;
import com.example.product.dto.ProductDto;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@RequestBody int id){
        return productService.findById(id);
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product){
//       int count=productService.findAll().size();
        int count= lastProduct()+1;
        product.setId(count);
        System.out.println(count);
        productService.save(product);
    }

    @PostMapping("/update-product")
    public void updateProduct(@RequestBody Product productDto){
        int id = productDto.getId();
        Product product = productService.findById(id);
        productDto.setId(product.getId());
        productService.save(productDto);
    }

    @DeleteMapping(value = "/delete-product/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        productService.deleteById(id);
        System.out.println("product deleted!!!");

    }


    @GetMapping("/last")
    public int lastProduct(){
       return productService.findAll().get(productService.findAll().size()-1).getId();
    }


}
