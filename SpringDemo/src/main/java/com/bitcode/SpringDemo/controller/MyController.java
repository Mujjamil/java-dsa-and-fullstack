package com.bitcode.SpringDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getHomePage(){
        return "Hello its Home Page";
    }
}
