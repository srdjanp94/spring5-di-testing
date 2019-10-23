package com.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hello - Say from the Primary service";
    }
}
