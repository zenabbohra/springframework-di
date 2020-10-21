package com.springframework.sfdi.controllers;

import com.springframework.sfdi.services.GreetingService;


public class PropertyInjectedController {
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
