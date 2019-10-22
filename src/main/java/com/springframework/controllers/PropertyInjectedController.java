package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;

public class PropertyInjectedController
{
    public GreetingServiceImpl greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
