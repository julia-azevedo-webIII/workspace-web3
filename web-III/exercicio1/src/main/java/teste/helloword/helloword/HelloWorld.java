package teste.helloword.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloWorld {

    @GetMapping("/ola")        //cria rota
    @ResponseBody             //para mostrar no corpo
    public String hello(){
        return "Hello, World!";
    }
}
    

    
