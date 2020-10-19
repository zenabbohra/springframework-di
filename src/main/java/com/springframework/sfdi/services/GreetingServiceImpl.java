package com.springframework.sfdi.services;

public class GreetingServiceImpl implements GreetingService{
  @Override public String sayGreeting() {
    System.out.println("Hello World");
    return "Hi folks";
  }
}
