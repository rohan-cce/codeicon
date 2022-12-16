package com.example.product.document;


import net.karneim.pojobuilder.GeneratePojoBuilder;
import lombok.Data;

import java.util.List;

@GeneratePojoBuilder
@Data
public class Product {
    private int id;
    private String name;
    private String brand=null;
    private String category;
    private String colour;
    private Double price;
    private String thumbnail;
    private List<String> image;
    private String description;
    private Double rating=3.0;
    private int stock;
    private int productSold;
    private int sellerId;
    private String fuelType;
    private int seatingCapacity;


}
