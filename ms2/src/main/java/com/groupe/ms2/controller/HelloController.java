package com.groupe.ms2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/")
public class HelloController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello world from ms2 !";
    }
}
