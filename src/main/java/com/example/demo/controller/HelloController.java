package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String healthCheck() {
        return "Application is up and running!";
    }

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello, World from Dockerized Java Web App!";
    }
}