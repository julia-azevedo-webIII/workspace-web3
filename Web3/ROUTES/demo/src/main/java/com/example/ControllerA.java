package com.example;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerA {
    //nao use respondebody pq n quer exibir nada na tela mas sim executar algo 
    @GetMapping("/inicio")
    public String inicio () {
        
        return "forware:/fim";  //ou usar redirect -> spring tenta dar um jeito de resolver esse retorno 
    }
    

}
