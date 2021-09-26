package com.jos.dem.springboot.module.library.service;

import com.jos.dem.springboot.module.library.config.LibraryProperties;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
@RequiredArgsConstructor
public class MessageService {

  private final LibraryProperties libraryProperties;

  public Mono<String> getMessage(){
    return Mono.just(libraryProperties.getMessage());
  }

}
