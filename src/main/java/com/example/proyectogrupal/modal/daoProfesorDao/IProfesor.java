package com.example.proyectogrupal.modal.daoProfesorDao;

import com.example.proyectogrupal.modal.entity.Matricula;
import com.example.proyectogrupal.modal.entity.Profesor;

public interface IProfesor {
    void save(Profesor profesor);
    void update(Profesor profesor);
    void delete(Profesor profesor);
    void findById(Profesor id);
}
