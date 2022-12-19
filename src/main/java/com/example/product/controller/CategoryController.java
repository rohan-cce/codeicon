package com.example.product.controller;

import com.example.product.model.ApiPath;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiPath.API)
@CrossOrigin(value = "*")
public class CategoryController {

}
