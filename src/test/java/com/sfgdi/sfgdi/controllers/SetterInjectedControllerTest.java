package com.sfgdi.sfgdi.controllers;

import com.sfgdi.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingService());
    }

    @Test
    void name() {
        System.out.println(controller.getGreeting());
    }
}