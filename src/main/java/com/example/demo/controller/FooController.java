package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examples")
public class FooController {

    @GetMapping("/hello")
    public String getHello(@RequestParam String name) {

        return "Hello " + name ;
    }

    @GetMapping("/sum")
    public Integer sumValues(@RequestParam Integer a, @RequestParam Integer b) {

        return a + b ;
    }

}

