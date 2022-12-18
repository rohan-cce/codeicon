package com.example.product.model;

public interface ApiPath {
  public String API = "/api";
  public String LOGIN =  "/user/login";
  public String CREATE_USER = "/createUser";
  public String PRODUCTS = API + "/products";
  public String VIEW_ALL_PRODUCTS = "/viewAllProducts";
  public String VIEW_PRODUCT =  "/view/{productId}";
  public String ADD_PRODUCT = "/add";
  public String ADD_CATEGORY = "/addCategory";

  public String REVIEWS = API + "/reviews";
  public String VIEW_ALL_REVIEWS = "/viewAllReviews";
  public String ADD_REVIEW = "/add";
}
