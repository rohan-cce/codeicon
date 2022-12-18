package com.example.product.service;

import com.example.product.document.Category;
import com.example.product.model.TagResponse;

public interface CategoryService {

  public void addCategory(Category category);

  public TagResponse getTagList(String categoryId);
}
