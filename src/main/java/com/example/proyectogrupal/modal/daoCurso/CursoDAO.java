package com.example.proyectogrupal.modal.daoCurso;

import com.example.proyectogrupal.entity.Curso;

public interface CursoDAO {
    void save (Curso curso);

    void update (Curso curso);

    void delete (Curso curso);

    void findById(Integer id);

}
