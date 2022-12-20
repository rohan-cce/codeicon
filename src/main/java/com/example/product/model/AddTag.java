package com.example.product.model;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Data
@GeneratePojoBuilder
public class AddTag {
    private String categoryId;
    private String productId;
    private String tagId;
    private String tagName;

}
