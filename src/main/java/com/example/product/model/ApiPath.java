package com.example.product.model;

public interface ApiPath {
  public String API = "/api";
  public String LOGIN =  "/user/login";
  public String CREATE_USER = "/createUser";
  public String PRODUCTS =  "/products";
  public String VIEW_ALL_PRODUCTS = PRODUCTS + "/viewAllProducts";
  public String VIEW_PRODUCT =  PRODUCTS + "/view/{productId}";
  public String ADD_PRODUCT = PRODUCTS + "/add";
  public String ADD_CATEGORY = PRODUCTS + "/addCategory";

  public String REVIEWS = API + "/reviews";
  public String VIEW_ALL_REVIEWS = "/viewAllReviews";
  public String ADD_REVIEW = "/add";

  public String ADD_CATEGRORY = "/addCategory";
}
