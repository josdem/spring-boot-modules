package com.jos.dem.springboot.service.impl;

import org.springframework.stereotype.Service;
import com.jos.dem.springboot.service.MessageService;

@Service
public class MessageSericeImpl implements MessageService {

  public String getMessage(){
    return "Hello World!";
  }

}
