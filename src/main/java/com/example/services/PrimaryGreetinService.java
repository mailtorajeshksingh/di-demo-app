package com.example.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetinService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello I am primary bean";
    }
}
