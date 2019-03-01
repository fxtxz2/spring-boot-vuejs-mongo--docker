package com.example.demo.controller;

import com.example.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        Greeting greeting = new Greeting();
        greeting.setId(1);
        greeting.setContent("Hello, World!");
        return greeting;
    }
}
