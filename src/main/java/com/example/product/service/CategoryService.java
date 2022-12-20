package com.example.product.service;

import com.example.product.document.Category;
import com.example.product.model.AddTag;
import com.example.product.model.AddTagResponse;
import com.example.product.model.LoginResponse;
import com.example.product.model.TagResponse;

public interface CategoryService {

  public void addCategory(Category category);

  public TagResponse getTagList(String categoryId);

  AddTagResponse<String> addTag(AddTag addTag);
}
