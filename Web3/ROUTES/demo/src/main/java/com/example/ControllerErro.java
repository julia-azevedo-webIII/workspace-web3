package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerErro {
    
    @GetMapping("/erro")
    @ResponseBody
    public String erro(){
        return "usuario nao autenticado";
    }
}
