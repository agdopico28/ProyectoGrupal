package com.example.proyectogrupal.modal.daoProfesorDao;

import com.example.proyectogrupal.entity.Profesor;

public interface IProfesor {
    void save(Profesor profesor);
    void update(Profesor profesor);
    void delete(Profesor profesor);
    void findById(Profesor id);
}
