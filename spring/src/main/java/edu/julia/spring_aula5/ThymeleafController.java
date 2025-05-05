package edu.julia.spring_aula5;

import org.springframework.web.bind.annotation.GetMapping;


public class ThymeleafController {
    

    @GetMapping({"", "/", "thymeleaf"})
    public String pagina(){
        
        return "pagina";
    }
}
