package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService
{
    public static final String HELLO_TEST = "Hello!!!";

    @Override
    public String sayGreeting()
    {
        return HELLO_TEST;
    }

}
