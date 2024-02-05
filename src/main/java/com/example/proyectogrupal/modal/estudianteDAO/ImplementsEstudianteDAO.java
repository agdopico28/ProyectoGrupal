package com.example.proyectogrupal.modal.estudianteDAO;

import com.example.proyectogrupal.entity.Estudent;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsEstudianteDAO implements EstudianteDAO {
    private final EntityManager entityManager;

    @Autowired
    public ImplementsEstudianteDAO(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void save(Estudent estudent) {
        entityManager.persist(estudent);
    }

    @Override
    public void update(Estudent estudent) {
        entityManager.merge(estudent);
    }

    @Override
    public void delete(Estudent estudent) {
        entityManager.remove(estudent.getIdEstudiante());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(EstudianteDAO.class, id);
    }
}
