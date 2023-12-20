package com.example.proyectogrupal.modal.daoMatriculaDao;

import com.example.proyectogrupal.modal.entity.Matricula;
import com.example.proyectogrupal.modal.entity.UsuarioAdmin;

public interface IMatriculaDao {
    void save(Matricula matricula);
    void update(Matricula matricula);
    void delete(Matricula matricula);
    void findById(Integer id);
}
