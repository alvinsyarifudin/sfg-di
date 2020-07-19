package com.sfgdi.sfgdi.controllers;

import com.sfgdi.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingServices greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
