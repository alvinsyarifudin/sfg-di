package com.sfgdi.sfgdi.controllers;

import com.sfgdi.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }
    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
