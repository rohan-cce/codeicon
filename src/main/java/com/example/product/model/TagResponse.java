package com.example.product.model;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.util.List;

@Data
@GeneratePojoBuilder
public class TagResponse {
  private String productId;
  private List<String> tagList;
}
