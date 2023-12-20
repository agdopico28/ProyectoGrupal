package com.example.proyectogrupal.modal.estudianteDAO;

import com.example.proyectogrupal.modal.entity.Estudiante;

public interface EstudianteDAO {

    void save (Estudiante estudiante);

    void update(Estudiante estudiante);

    void delete(Estudiante estudiante);

    void findById(Integer id);

}
