package com.jos.dem.springboot.module.controller;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.module.library.service.MessageService;

@RestController
public class ModuleController {

  @Autowired
  private MessageService messageService;

  @GetMapping("/")
  public Mono<String> index(){
    return messageService.getMessage();
  }

}
