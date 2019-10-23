package com.springframework.controllers;

import com.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController
{
    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController( GreetingService greetingService )
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
