package com.example.proyectogrupal.modal.daoProfesorDao;

import com.example.proyectogrupal.entity.Teacher;

public interface IProfesor {
    void save(Teacher teacher);
    void update(Teacher teacher);
    void delete(Teacher teacher);
    void findById(Teacher id);
}
