package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Clase;
import com.example.proyectogrupal.services.ClaseServiceContract;
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
    private final ClaseServiceContract claseServiceContract;

    @Autowired
    public ClaseController(ClaseServiceContract claseServiceContract) {
        this.claseServiceContract = claseServiceContract;
    }

    @GetMapping
    public List<Clase> allClasses() {
        return claseServiceContract.allClasses();
    }

    @PostMapping
    public Clase save(@RequestBody Clase clase) {
        return claseServiceContract.save(clase);
    }
}
