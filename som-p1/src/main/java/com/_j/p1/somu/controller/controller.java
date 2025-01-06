package com._j.p1.somu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("hello")
    public String welcomeUser() {
        return "I am learning springboot";
    }
}
