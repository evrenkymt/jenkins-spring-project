package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/hi")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/bye")
    public String bye() {
        return "bye";
    }

}
