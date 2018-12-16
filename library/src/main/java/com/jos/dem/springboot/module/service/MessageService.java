package com.jos.dem.springboot.module.library.service;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class MessageService {

  @Value("${message}")
  private String message;

  public Mono<String> getMessage(){
    return Mono.just(message);
  }

}
