package br.edu.ifpr.spring_aula5;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.ifpr.spring_aula5.models.Task;
import org.springframework.ui.Model;

@Controller
public class ThymeleafController {
    

    @GetMapping({"", "/", "/thymeleaf"})
    public String pagina(Model model){

        Task task = new Task(1L, "Ler a doc. do Thymeleaf", LocalDateTime.now());
        
        model.addAttribute("atributo", "Valor do atributo");

        model.addAttribute("task", task);
       
        return "pagina";
    }
}
