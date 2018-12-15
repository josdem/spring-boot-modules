package com.jos.dem.springboot.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.module.library.service.MessageService;

@RestController
public class ModuleController {

  @Autowired
  private MessageService messageService;

  @GetMapping("/")
  public String index(){
    return "Hello World!";
  }

}
