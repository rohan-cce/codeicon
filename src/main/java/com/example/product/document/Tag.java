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
  private int likes = 0;
  private int dislikes = 0;
  private boolean isRecommended = true;
}
