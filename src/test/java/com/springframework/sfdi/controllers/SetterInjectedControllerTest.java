package com.springframework.sfdi.controllers;

import com.springframework.sfdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(setterInjectedController.getGreeting());
  }
}
