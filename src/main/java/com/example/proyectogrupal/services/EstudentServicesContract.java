package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Estudent;

import java.util.List;

public interface EstudentServicesContract {
    List<Estudent> allEstudents();
    Estudent findByNameEstudent(Estudent estudent);
    Estudent save(Estudent estudent);
    void update(Estudent estudent);
    Estudent delete(Estudent estudent);
}
