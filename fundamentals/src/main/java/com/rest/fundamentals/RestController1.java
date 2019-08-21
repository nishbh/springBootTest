package com.rest.fundamentals;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController1 {
    @RequestMapping("/")
    String home() {
        return "Hello Test Rest 101--via Spring Boot";
    }
}
