package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Clase;
import com.example.proyectogrupal.services.ClaseServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
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
    public String allClasses(Model model) {
        List<Clase> clases = claseServiceContract.allClasses();
        model.addAttribute("clases", clases);
        return "clases";
    }

    @PostMapping
    public Clase save(@RequestBody Clase clase) {
        return claseServiceContract.save(clase);
    }

    @PutMapping("/update/{id}")
    public void modify(@PathVariable Long id, @RequestBody Clase clase) {
        clase.setIdClase(id); // Asignar el ID recibido al objeto Clase
        claseServiceContract.update(clase);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        claseServiceContract.delete(id);
    }
}
