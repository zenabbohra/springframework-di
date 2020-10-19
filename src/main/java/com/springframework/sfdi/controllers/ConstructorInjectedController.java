package com.springframework.sfdi.controllers;

import com.springframework.sfdi.services.GreetingService;

public class ConstructorInjectedController {

  private final GreetingService greetingService;

  public ConstructorInjectedController(
      GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
