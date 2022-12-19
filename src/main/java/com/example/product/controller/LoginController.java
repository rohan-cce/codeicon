package com.example.product.controller;

import com.example.product.document.User;
import com.example.product.model.ApiPath;
import com.example.product.model.LoginResponse;
import com.example.product.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequestMapping(value = ApiPath.API)
@CrossOrigin(value = "*")
public class LoginController {
  @Autowired
  private LoginService loginService;

  @GetMapping(value = ApiPath.LOGIN)
  public LoginResponse loginAuthentication(
          @RequestParam(value = "userId", required = true) String userId,
          @RequestParam(value = "password", required = true) String password){
    return loginService.userLogin(userId, password);
  }

  @PostMapping(value = ApiPath.CREATE_USER)
  public LoginResponse createUser(
          @RequestParam(value = "userId", required = true) String userId,
          @RequestParam(value = "password", required = true) String password){
    return loginService.createUser(userId,password);
  }


}
