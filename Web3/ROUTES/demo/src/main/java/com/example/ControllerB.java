package com.example;

import org.springframework.web.bind.annotation.GetMapping;

public class ControllerB {

    @GetMapping("/fim")
    public String fim(){

        return "fim";
    }
    
}
