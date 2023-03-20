package com.earquake.sgfdi.controllers;

import com.earquake.sgfdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    private PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}