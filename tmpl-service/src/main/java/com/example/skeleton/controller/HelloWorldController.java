package com.example.skeleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorldMessage() {

        return "Hello world in " + new Date().toString();
    }

}
