package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Clase;
import com.example.proyectogrupal.services.ClaseServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update/{name}")
    public void modify(@RequestBody Clase clase) {
        claseServiceContract.update(clase);
    }

    @DeleteMapping("/delete/{name}")
    public void delete(@PathVariable String claseName) {
        claseServiceContract.delete(claseName);
    }
}
