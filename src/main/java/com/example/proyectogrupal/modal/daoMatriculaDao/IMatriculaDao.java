package com.example.proyectogrupal.modal.daoMatriculaDao;

import com.example.proyectogrupal.entity.Matricula;

public interface IMatriculaDao {
    void save(Matricula matricula);
    void update(Matricula matricula);
    void delete(Matricula matricula);
    void findById(Integer id);
}
