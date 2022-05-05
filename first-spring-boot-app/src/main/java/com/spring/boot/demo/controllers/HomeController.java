package com.spring.boot.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "<h1>HHello Spring Boot!! :)</h1>";
    }

    @GetMapping("/jsonMessage")
    public List<String> showMessage() {
        return List.of("Hello", "Spring", "Boot", "!");
    }

}