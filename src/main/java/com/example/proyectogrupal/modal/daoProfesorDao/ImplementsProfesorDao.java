package com.example.proyectogrupal.modal.daoProfesorDao;

import com.example.proyectogrupal.modal.entity.Matricula;
import com.example.proyectogrupal.modal.entity.Profesor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class ImplementsProfesorDao implements IProfesor {

    private final EntityManager entityManager;

    @Autowired
    public ImplementsProfesorDao(EntityManager theEntityManager) {entityManager = theEntityManager;}

    @Override
    public void save(Profesor profesor) {
        entityManager.persist(profesor);
    }

    @Override
    public void update(Profesor profesor) {
        entityManager.merge(profesor);

    }

    @Override
    public void delete(Profesor profesor) {
        entityManager.remove(profesor.getId_profesor());

    }

    @Override
    public void findById(Profesor id) {
        entityManager.find(Matricula.class, id);
    }
}
