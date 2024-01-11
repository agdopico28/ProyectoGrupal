package com.example.proyectogrupal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping({"/index", "/", "/home"})
    public String index(Map<String,Object> map){
        map.put("titulo", "Programa de prueba");
        return "front";
    }
}
