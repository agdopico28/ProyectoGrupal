package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Curso;

import java.util.List;

public interface CourseServContract {
    List<Curso> allCourses();
    Curso findByName(Curso curso);
    Curso save (Curso curso);
    void update (Curso curso);
    Curso delete (Curso curso);
}
