package com.example.services;

import org.springframework.stereotype.Component;

/**
 * Created by Rajesh Singh on 2/2/2019
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreetin() {
        return "Spanish Greeting Service";
    }

    @Override
    public String getGermanGreeting() {
        return "German Greeting Service";
    }
}
