package com.example.rotas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;


import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RoutesController {


    @GetMapping("/data")
    @ResponseBody
    public String obtainData(){

        return "return some data";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(){
        return "create";
    }

    @GetMapping("/bebidas/{drinkType}")
    public String drinkType(@PathVariable(value = "drinkType", required = false) String drinkType) {

        return "The drink closen was: " + drinkType;
    }

    @GetMapping("/variables")
    @ResponseBody
    public String getURLVariables (@RequestParam Optional<String> category) { //requestparam permite q pegue os valores da requisição
    
       return "The category chosen was null" + category.orElse("is null");
    }
    
    @PostMapping("/login")
    @ResponseBody
    public String getForm(@RequestParam String user,@RequestParam String password) { //requestparam permite q pegue os valores da requisição
    
       return user + "<br>" + password;
    }

    @GetMapping("/produtos/search")
    @ResponseBody
        public String pesquisaProduto(@RequestParam String nome, @RequestParam String marca){

                return "Os produtos escolhidos foram: " +nome + "<br>" + marca;
        }

    
    
    
    
}
