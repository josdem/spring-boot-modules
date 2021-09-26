package com.jos.dem.springboot.module.controller;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jos.dem.springboot.module.library.service.MessageService;

@RestController
@RequiredArgsConstructor
public class ModuleController {

  private final MessageService messageService;

  @GetMapping("/")
  public Mono<String> index(){
    return messageService.getMessage();
  }

}
