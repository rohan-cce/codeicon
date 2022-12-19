package com.example.product.controller;

import com.example.product.document.Category;
import com.example.product.model.ApiPath;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiPath.API)
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  @PostMapping(value = ApiPath.VIEW_ALL_REVIEWS)
  public void getAllReviews(@RequestBody Category category){
     categoryService.addCategory(category);
  }
}
