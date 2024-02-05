package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Clase;

import java.util.List;

public interface ClaseRepositoryContract {
    List<Clase> allClasses();
    Clase findByNameClass(Clase clase);
    Clase save(Clase clase);
    void update(Clase clase);
    Clase delete(Clase clase);
}
