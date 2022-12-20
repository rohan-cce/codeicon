package com.example.product.service.impl;

import com.example.product.document.Category;
import com.example.product.model.AddTag;
import com.example.product.model.AddTagResponse;
import com.example.product.model.LoginResponse;
import com.example.product.model.TagResponse;
import com.example.product.repository.CategoryRepository;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.product.document.Tag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    List<String> stringList = new ArrayList<>();
    Category category = categoryRepository.findByProductId(productId);
    List<Tag> tagList = category.getTagList();
    for (int i=0; i < tagList.size(); i++){
     stringList.add(tagList.get(i).getTagName());
    }
    TagResponse tagResponse = new TagResponse();
    tagResponse.setProductId(productId);
    tagResponse.setTagList(stringList);
    return tagResponse;
  }

  @Override
  public AddTagResponse<String> addTag(AddTag addTag) {
    AddTagResponse<String> addTagResponse = new AddTagResponse<>();
    if(categoryRepository.findByCategoryIdAndProductId(addTag.getCategoryId(),addTag.getProductId()).isPresent()){
      Category category = categoryRepository.findByCategoryIdAndProductId(addTag.getCategoryId(),addTag.getProductId()).get();
      category.setId(category.getId());
      Tag tag = new Tag();
      tag.setTagId(addTag.getTagId());
      tag.setTagName(addTag.getTagName());
      List<Tag> tagList = category.getTagList();
      tagList.add(tag);
      categoryRepository.save(category);
      addTagResponse.setCode("200");
      addTagResponse.setValue(String.valueOf(category));
      return addTagResponse;
    }
      addTagResponse.setCode("500");
      addTagResponse.setValue("CategoryId or ProductId is not correct");
      return addTagResponse;
  }
}
