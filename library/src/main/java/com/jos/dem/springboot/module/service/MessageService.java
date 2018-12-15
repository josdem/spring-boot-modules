package com.jos.dem.springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MessageService {

  public String getMessage(){
    return "Hello World!";
  }

}
