package com.springframework.sfdi.controllers;

import com.springframework.sfdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
