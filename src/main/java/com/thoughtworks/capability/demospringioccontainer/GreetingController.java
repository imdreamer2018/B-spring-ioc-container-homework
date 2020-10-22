package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class GreetingController {

    private final WebApplicationContext applicationContext;

    @Autowired
    public GreetingController( WebApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping("/greet")
    public String greet() {
        return this.applicationContext.getBean(GreetingService.class).sayHi();
    }

}
