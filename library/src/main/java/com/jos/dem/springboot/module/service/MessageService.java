package com.jos.dem.springboot.module.library.service;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MessageService {

  @Autowired ServiceProperties serviceProperties;

  public Mono<String> getMessage(){
    return serviceProperties.getMessage();
  }

}
