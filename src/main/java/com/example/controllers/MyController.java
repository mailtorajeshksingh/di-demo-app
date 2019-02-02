package com.example.controllers;

import com.example.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
