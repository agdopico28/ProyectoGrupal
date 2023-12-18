package com.example.proyectogrupal.modal.DAO;

import com.example.proyectogrupal.modal.entity.Curso;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsCursoDAO implements CursoDAO{

    private final EntityManager entityManager;

    @Autowired
    public ImplementsCursoDAO(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Curso curso) {
        entityManager.persist(curso);
    }

    @Override
    public void update(Curso curso) {
        entityManager.merge(curso);
    }

    @Override
    public void delete(Curso curso) {
        entityManager.remove(curso.getId_curso());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(CursoDAO.class, id);
    }
}
