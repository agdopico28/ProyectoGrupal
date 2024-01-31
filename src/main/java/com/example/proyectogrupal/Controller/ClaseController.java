package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.services.ClaseServContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clases")
public class ClaseController {

    private final ClaseServContract claseServContract;

    @Autowired
    public ClaseController(ClaseServContract claseServContract) {
        this.claseServContract = claseServContract;
    }
}
