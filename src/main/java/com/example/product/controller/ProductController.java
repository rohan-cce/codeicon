package com.example.product.controller;


import com.example.product.document.Product;
import com.example.product.dto.ProductDto;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/products")
@CrossOrigin(value = "*")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAll();
    }
    

    @PostMapping("/particular/{id}")
    public Product getProduct(@PathVariable("id") String id){
        System.out.println(id+" id value");
//        try{
//            //int ans=id/5;
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        return productService.findById(Integer.parseInt(id));
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product){
//       int count=productService.findAll().size();

        int count = lastProduct()+1;
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

    @GetMapping(value = "/delete-product/{id}")
    public List<Product> deleteProduct(@PathVariable("id") int id){

        RestTemplate template = new RestTemplate();
        String url="http://10.20.4.81:9010/cart/remove-cart/"+id;
        template.getForObject(url,void.class);
        System.out.println(" sfasfsd dfsdf");
        productService.deleteById(id);


        System.out.println("product deleted!!!");
        return productService.findAll();
    }


    public int lastProduct(){
       return productService.findAll().get(productService.findAll().size()-1).getId();
    }




}
