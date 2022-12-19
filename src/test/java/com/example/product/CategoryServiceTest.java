package com.example.product;

import com.example.product.document.Category;
import com.example.product.document.Tag;
import com.example.product.repository.CategoryRepository;
import com.example.product.service.impl.CategoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CategoryServiceTest {

  @InjectMocks
  private CategoryServiceImpl categoryService;

  @Mock
  private CategoryRepository categoryRepository;

  @Test
  public void tagListTest(){
    List<Tag> tagList = new ArrayList<>();
    Tag tag = new Tag();
    tag.setLikes(0);
    tag.setDislikes(0);
    tag.setRecommended(false);
    tagList.add(tag);
    Category category = new Category();
    category.setCategoryId("categoryId");
    category.setCategoryName("Quality");
    category.setTagList(tagList);
    when(categoryRepository.findByCategoryId(anyString())).thenReturn(category);
    categoryService.getTagList("categoryId");
    verify(categoryRepository).findByCategoryId("categoryId");
  }
}
