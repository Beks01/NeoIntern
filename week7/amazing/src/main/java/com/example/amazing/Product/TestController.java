package com.example.amazing.Product;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/testApi")
    public String testApi(){
        return "Hello Postman !!  API test successful ";
    }



}
