package com.example.product.model;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.util.HashMap;

@Data
@GeneratePojoBuilder
public class CommentResponse {
  private String productId;
  private HashMap<String, String> commentHashMap;
}
