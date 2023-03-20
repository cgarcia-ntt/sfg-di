package com.earquake.sgfdi.controllers;

import com.earquake.sgfdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    private final GreetingService greetingService;

    public TestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
