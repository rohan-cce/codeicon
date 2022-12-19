package com.example.product.document;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Data
@GeneratePojoBuilder
public class TagReview {
  private String tagId;
  private String tagName;
  private boolean isLiked;
}
