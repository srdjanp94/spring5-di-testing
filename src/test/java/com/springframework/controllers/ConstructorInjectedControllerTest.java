package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest
{
    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() throws Exception
    {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }


    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_TEST, constructorInjectedController.sayHello());
    }
}
