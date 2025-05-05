package br.edu.ifpr.estudo_dirigido_um.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.ifpr.estudo_dirigido_um.models.Product;

@Controller
public class StoreController {
   
    private List<Product> products = new ArrayList<Product>();

    @GetMapping("/stores/{store}")
    public String stores(@PathVariable String store, Model model){
        
        Product p1 = new Product(1L, "Celular", 80.0);
        Product p2 = new Product(1L, "Cafeteira", 20.0);
        Product p3 = new Product(1L, "Mouse", 15.50);

        products = Arrays.asList(p1,p2,p3);
        model.addAttribute("store", store);
        model.addAttribute("products", products);
       
        return "store";
    }
}

