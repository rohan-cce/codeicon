package com.example.product.service;

import org.springframework.stereotype.Service;
import rx.Single;
import com.example.product.model.LoginResponse;

public interface LoginService {
  public LoginResponse userLogin(String userId, String password);
  public LoginResponse createUser(String userId, String password);
}
