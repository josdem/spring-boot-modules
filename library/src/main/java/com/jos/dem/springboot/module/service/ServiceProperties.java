package com.jos.dem.springboot.module.library.service;

import reactor.core.publisher.Mono;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class ServiceProperties {

  private String message;

  public Mono<String> getMessage() {
    return Mono.just("Hello World");
  }

    public void setMessage(String message) {
        this.message = message;
    }
}
