package com.example.proyectogrupal.modal.daoMatriculaDao;

import com.example.proyectogrupal.modal.entity.Matricula;
import com.example.proyectogrupal.modal.entity.Profesor;
import com.example.proyectogrupal.modal.entity.UsuarioAdmin;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ImplementsMatriculaDao implements IMatriculaDao{

    private final EntityManager entityManager;

    @Autowired
    public ImplementsMatriculaDao(EntityManager theEntityManager) {entityManager = theEntityManager;}


    @Override
    @Transactional
    public void save(Matricula matricula) {
        entityManager.persist(matricula);
    }

    @Override
    public void update(Matricula matricula) {
        entityManager.merge(matricula);

    }

    @Override
    public void delete(Matricula matricula) {
        entityManager.remove(matricula.getId_matricula());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(Profesor.class, id);
    }
}
