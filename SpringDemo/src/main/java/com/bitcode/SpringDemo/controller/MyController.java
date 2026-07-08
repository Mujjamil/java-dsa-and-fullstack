package com.bitcode.SpringDemo.controller;

import com.bitcode.SpringDemo.entitiy.Student;
import org.springframework.web.bind.annotation.*;

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

            return "Product id = "+pid+"Brand Name="+pName;
    }
    //localhost:8080/getProduct/1/abc
    @GetMapping("/getProduct/{pid}/{pName}")
    public String getProduct(@PathVariable int pid,@PathVariable String pName){
        return "Product id ="+pid+"Brancd Name="+pName;
    };
    @PostMapping("/createProduct")
    public String createProduct(@RequestBody Student s1){
        return "new record created"+s1;
    }
    @PutMapping("/updateStudent/{rollno}")
    public String updateRecord(@PathVariable int rollno,@RequestBody Student s1){
        return "Record Updated for rollno="+rollno+"with new marks="+s1;
    }
    @DeleteMapping("/deleteStudent/{rollno}")
    public String deleteRecord(@PathVariable int rollno){
        return "student removed with rollno="+rollno;
    }
}
