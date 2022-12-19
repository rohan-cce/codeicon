package com.example.product.document;

import lombok.Builder;
import lombok.Data;
import lombok.Value;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Data
@GeneratePojoBuilder
public class TagReview {
  private String tagId;
  private String tagName;
  private Boolean isLiked;
}
