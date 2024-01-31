package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Clase;

import java.util.List;

public interface ClaseRepContract {
    List<Clase> allClasses();
    Clase findByNameClass(Clase clase);
    void save(Clase clase);
    void update(Clase clase);
    void delete(Integer id);
}
