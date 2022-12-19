package com.example.product.model;

import com.example.product.document.TagReview;
import lombok.Data;
import java.util.List;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Data
@GeneratePojoBuilder
public class AddReviewRequest {
  private String categoryId;
  private String categoryName;
  private List<TagReview> tagList;
}
