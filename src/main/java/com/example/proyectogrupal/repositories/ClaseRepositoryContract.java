package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Clase;

import java.util.List;

public interface ClaseRepositoryContract {
    List<Clase> allClasses();
    Clase findById(Long id);
    Clase findByName(String className);
    Clase save(Clase clase);
    void update(Clase clase);
    void delete(Long id);
}
