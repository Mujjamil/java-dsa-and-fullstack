package com.bitcode.SpringDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getHomePage(){
        return "Hello its Home Page";
    }
    @GetMapping("/products")
    public String  getProducts(){
        return "All product fetched";
    }
    //localhost:8080/search?pid=1&pCompany=abc
    @GetMapping("/search")
    public String search(@RequestParam int pid,@RequestParam String pName){
        {
            return "Product id = "+pid+"Brand Name="+pName;
        }

    }

}
