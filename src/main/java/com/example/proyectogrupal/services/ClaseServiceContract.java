package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Clase;

import java.util.List;

public interface ClaseServiceContract {
    List<Clase> allClasses();
    Clase findByNameClass(String claseName);
    Clase save(Clase clase);
    void update(Clase clase);
    void delete(String nameClase);
}
