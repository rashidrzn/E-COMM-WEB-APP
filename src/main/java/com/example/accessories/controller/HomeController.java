package com.example.accessories.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to the world of entony maame!!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "this is about page";
    }

}
