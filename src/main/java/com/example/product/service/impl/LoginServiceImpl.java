package com.example.product.service.impl;

import com.example.product.document.User;
import com.example.product.model.LoginResponse;
import com.example.product.repository.UserRepository;
import com.example.product.service.LoginService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Single;

import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public LoginResponse userLogin(String userId, String password) {
    User user = userRepository.findByUserId(userId);
    LoginResponse loginResponse = new LoginResponse();
    if(Objects.nonNull(user) && user.getPassword().equalsIgnoreCase(password)){
      loginResponse.setCode("200");
      loginResponse.setMessage("Login Success");
      return loginResponse;
    }
    loginResponse.setCode("500");
    loginResponse.setMessage("Authentication Failed");
    return loginResponse;
  }

  @Override
  public LoginResponse createUser(String userId, String password) {
    User user = new User();
    user.setPassword(password);
    user.setUserId(userId);
    userRepository.insert(user);

    LoginResponse loginResponse = new LoginResponse();
    loginResponse.setCode("200");
    loginResponse.setMessage("user created");
    return loginResponse;
  }
}
