package com.example;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class Routes {

    Integer contador  = 0; //variavel compartilhada 
    
    @GetMapping("/produtos/search")
    @ResponseBody
    public String search(@RequestParam(name = "produto") String xpto, @RequestParam(name="categoria") String xyz){

        return "O parametro informado foi: " + xpto + " da categoria: " +xyz;
    }

    @GetMapping("/contador")
    @ResponseBody
    public String contador(){
    // se contador fosse declarada aqui seria thread safe, conta apenas para a requsição, a pessoa q ve esse computador nao ve o dos outros, 

        contador++;
        return "Número de acessos: "+contador;
    }
    
}
