package com.example.product.document;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Data
@GeneratePojoBuilder
public class Tag {
  private String tagName;
  private int likes;
  private int dislikes;
  private boolean isRecommended;
}
