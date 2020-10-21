package com.springframework.sfdi.controllers;

import com.springframework.sfdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

  PropertyInjectedController propertyInjectedController;

  @BeforeEach
  void setUp() {
    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingService = new GreetingServiceImpl();
  }

  @Test
  void getGreeting() {
    System.out.println(propertyInjectedController.getGreeting());
  }
}
