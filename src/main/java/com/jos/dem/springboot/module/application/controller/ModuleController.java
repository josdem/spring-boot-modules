package com.jos.dem.springboot.module.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

  @GetMapping("/")
  public String index(){
    return "Hello World!";
  }

}
