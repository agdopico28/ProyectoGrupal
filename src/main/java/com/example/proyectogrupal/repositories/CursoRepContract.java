package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Curso;

import java.util.List;

public interface CursoRepContract {
    List<Curso> allCourses();
    Curso findByName(Curso curso);
    Curso save (Curso curso);
    void update (Curso curso);
    Curso delete (Curso curso);
}
