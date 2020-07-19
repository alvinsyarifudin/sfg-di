package com.sfgdi.sfgdi.controllers;

import com.sfgdi.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstrucorInjectedController {
    private final GreetingServices greetingServices;

    public ConstrucorInjectedController(@Qualifier("constructorGreetingService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
