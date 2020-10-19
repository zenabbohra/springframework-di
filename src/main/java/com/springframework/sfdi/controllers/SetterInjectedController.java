package com.springframework.sfdi.controllers;

import com.springframework.sfdi.services.GreetingService;

public class SetterInjectedController {

  public GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}