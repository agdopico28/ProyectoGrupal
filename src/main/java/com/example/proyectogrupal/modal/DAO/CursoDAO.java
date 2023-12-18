package com.example.proyectogrupal.modal.DAO;

import com.example.proyectogrupal.modal.entity.Curso;

public interface CursoDAO {
    void save (Curso curso);

    void update (Curso curso);

    void delete (Curso curso);

    void findById(Integer id);

}
