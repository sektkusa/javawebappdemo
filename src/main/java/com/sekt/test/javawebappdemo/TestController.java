package com.sekt.test.javawebappdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot framework!";
    }
}
