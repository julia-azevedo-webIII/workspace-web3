package teste.helloword.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;


@Controller   //quando adiciono quem gerencia essa classe é o spring 
public class EnderecoController {
    
    @GetMapping("/requisicao")
    public String hello (HttpServletRequest request) {//injeção de independencia 
        
        String metodo = request.getMethod(); //açucar sintético 
        String uri = request.getRequestURI();
        String protocolo = request.getProtocol();

        String resposta = "Método: " + metodo + " URI: " + uri + "Protocolo: " + protocolo;

        return resposta;

    }

    @GetMapping("/cabecalhos")
    @ResponseBody
    public String cabecalhos (HttpServletRequest request) {
        String host = request.getHeader("Host");
        String userAgent = request.getHeader("User-Agent");
        String accept = request.getHeader("Accept-encoding");
        String language = request.getHeader("Accept-language");
        
        return host + "<br>" + userAgent + "<br>" + accept + "<br>" + language;
    }



}
