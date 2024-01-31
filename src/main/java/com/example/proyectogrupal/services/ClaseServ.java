package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Clase;
import com.example.proyectogrupal.repositories.ClaseRep;
import com.example.proyectogrupal.repositories.ClaseRepContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClaseServ implements ClaseServContract {
    private final ClaseRepContract claseRep;

    @Autowired
    public ClaseServ(ClaseRep claseRep) {
        this.claseRep = claseRep;
    }

    @Override
    public List<Clase> allClasses() {
        return claseRep.allClasses();
    }

    @Override
    public Clase findByNameClass(Clase clase) {
        return claseRep.findByNameClass(clase);
    }

    @Override
    public Clase save(Clase clase) {
        return claseRep.save(clase);
    }

    @Override
    public void update(Clase clase) {
        claseRep.update(clase);
    }

    @Override
    public Clase delete(Clase clase) {
        return claseRep.delete(clase);
    }
}
