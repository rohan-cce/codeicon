package com.example.product.document;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;
import org.springframework.data.annotation.Id;

@Data
@GeneratePojoBuilder
public class Tag {
  @Id
  private int tagId;
  private String tagName;
  private int likes;
  private int dislikes;
  private boolean isRecommended;
}
