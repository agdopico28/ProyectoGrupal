package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Estudent;

import java.util.List;

public interface EstudentRepositoryContract {
    List<Estudent> allEstudents();
    Estudent findByNameEstudent(Estudent estudent);
    Estudent save(Estudent estudent);
    void update(Estudent estudent);
    Estudent delete(Estudent estudent);
}
