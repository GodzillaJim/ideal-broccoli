package com.github.godzillajim.codypipelinetest.controllers;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    static Random random = new Random();    
    @GetMapping
    public String getHome(){
        return "Application is running";
    }

    @GetMapping("/number")
    public Integer getRandomNumber(){
        return random.nextInt(10000);
    }
}
