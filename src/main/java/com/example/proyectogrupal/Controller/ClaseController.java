package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Clase;
import com.example.proyectogrupal.services.ClaseServContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/clases")
public class ClaseController {
    private final ClaseServContract claseServContract;

    @Autowired
    public ClaseController(ClaseServContract claseServContract) {
        this.claseServContract = claseServContract;
    }

    @GetMapping
    public List<Clase> allClasses() {
        return claseServContract.allClasses();
    }

    @PostMapping
    public Clase save(@RequestBody Clase clase) {
        return claseServContract.save(clase);
    }
}
