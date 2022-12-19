package com.example.product.document;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@GeneratePojoBuilder
public class Category {
  @Id
  private String id;
  private String categoryId;
  private String productId;
  private String productName;
  private String categoryName;
  private String textReview = "";
  private List<Tag> tagList;
}
