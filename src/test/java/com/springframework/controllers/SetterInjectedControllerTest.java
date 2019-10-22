package com.springframework.controllers;

import com.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest
{
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception
    {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_TEST, setterInjectedController.sayHello());
    }
}
