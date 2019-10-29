package com.springframework.services;


public class PrimaryGermanGreetingService implements GreetingService
{
    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepositoryImpl) {
        this.greetingRepository = greetingRepositoryImpl;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
