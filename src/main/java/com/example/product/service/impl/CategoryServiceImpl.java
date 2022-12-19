package com.example.product.service.impl;

import com.example.product.document.Category;
import com.example.product.model.TagResponse;
import com.example.product.repository.CategoryRepository;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.product.document.Tag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  CategoryRepository categoryRepository;

  @Override
  public void addCategory(Category category) {
    categoryRepository.save(category);
  }

  @Override
  public TagResponse getTagList(String productId) {
    List<String>  stringList = new ArrayList<>();
    Category category = categoryRepository.findByProductId(productId);
    List<Tag> tagList = category.getTagList();
   for (int i=0; i < tagList.size(); i++){
     stringList.add(tagList.get(i).getTagName());
   }
   TagResponse  tagResponse = new TagResponse();
   tagResponse.setProductId(productId);
   tagResponse.setTagList(stringList);

   return tagResponse;
  }
}
