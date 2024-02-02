package com.example.proyectogrupal.modal.estudianteDAO;

import com.example.proyectogrupal.entity.Estudiante;
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
    public void save(Estudiante estudiante) {
        entityManager.persist(estudiante);
    }

    @Override
    public void update(Estudiante estudiante) {
        entityManager.merge(estudiante);
    }

    @Override
    public void delete(Estudiante estudiante) {
        entityManager.remove(estudiante.getIdEstudiante());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(EstudianteDAO.class, id);
    }
}
