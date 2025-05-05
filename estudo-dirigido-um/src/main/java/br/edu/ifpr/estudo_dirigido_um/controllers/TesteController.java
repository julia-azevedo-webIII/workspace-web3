package br.edu.ifpr.estudo_dirigido_um.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TesteController {
    @GetMapping("/teste")
    
    public String teste(){
     return "teste" ;  
    }
}
