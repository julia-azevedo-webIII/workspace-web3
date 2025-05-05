package edu.validacao.validacao_formularios.controllers;

import edu.validacao.validacao_formularios.models.Estudante;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class EstudanteController {

    @GetMapping("/estudante")
    public String cadastro(Estudante estudante) {
        return "estudante-cadastro";
    }

    @PostMapping("/estudante")
    public String processarCadastro(@ModelAttribute @Valid Estudante estudante, BindingResult fields, Model model) throws IOException {
        //deveria estar em um lugar compartilhado e nao em um metodo

        String UPLOAD_DIR = "src/main/resources/static/uploads/";

        if(fields.hasErrors()){
            return "estudante-cadastro";
        }
        if (estudante.getAvatar() != null && !estudante.getAvatar().isEmpty()){
            String fileName  = estudante.getAvatar().getOriginalFilename();

            Path path = Paths.get(UPLOAD_DIR+fileName);

            Files.createDirectories(path.getParent());

            Files.copy(estudante.getAvatar().getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        }


        model.addAttribute("estudante", estudante);

        return "sucesso";
    }

}
