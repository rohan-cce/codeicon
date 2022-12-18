package com.example.product.document;


import net.karneim.pojobuilder.GeneratePojoBuilder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@GeneratePojoBuilder
@Data
public class Product {
    @Id
    String id;
    String name;
    String imageUrl;
    Double price;
    String categoryId;

}
