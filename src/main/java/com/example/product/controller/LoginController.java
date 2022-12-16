package com.example.product.controller;

import com.example.product.model.ApiPath;
import com.example.product.model.LoginResponse;
import com.example.product.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
@RequestMapping(value = ApiPath.API)
public class LoginController {

  @Autowired
  private LoginService loginService;

  @GetMapping(value = ApiPath.LOGIN)
  public LoginResponse loginAuthentication(@RequestParam("userId") String userId, @RequestParam("password") String password){
return loginService.userLogin(userId, password);
  }

  @PostMapping(value = ApiPath.CREATE_USER)
  public void createUser(){
    loginService.createUser();
  }


}
