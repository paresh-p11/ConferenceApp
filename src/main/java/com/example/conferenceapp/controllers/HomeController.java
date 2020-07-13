package com.example.conferenceapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

  @Value("${app.version}")
  private String appVersion;


  @GetMapping
  @RequestMapping("/")
  // auto marshals map to json
  public Map getAppVersion(){
    Map<String,String> customProps = new HashMap<>();
    customProps.put("app_version" , appVersion);
    return customProps;
  }

}
