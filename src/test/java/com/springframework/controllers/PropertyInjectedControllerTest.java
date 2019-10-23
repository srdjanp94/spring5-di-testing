package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest
{
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception
    {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }


    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_TEST, propertyInjectedController.sayHello());
    }
}
