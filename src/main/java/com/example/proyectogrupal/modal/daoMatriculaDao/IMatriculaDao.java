package com.example.proyectogrupal.modal.daoMatriculaDao;

import com.example.proyectogrupal.entity.Enrollment;

public interface IMatriculaDao {
    void save(Enrollment enrollment);
    void update(Enrollment enrollment);
    void delete(Enrollment enrollment);
    void findById(Integer id);
}
