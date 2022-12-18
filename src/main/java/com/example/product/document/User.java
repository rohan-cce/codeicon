package com.example.product.document;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

@Data
@GeneratePojoBuilder
public class User {
  private String userId;
  private String password;
}
