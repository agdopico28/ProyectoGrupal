package com.example.proyectogrupal.modal.daoProfesorDao;

import com.example.proyectogrupal.entity.Enrollment;
import com.example.proyectogrupal.entity.Teacher;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsProfesorDao implements IProfesor {

    private final EntityManager entityManager;

    @Autowired
    public ImplementsProfesorDao(EntityManager theEntityManager) {entityManager = theEntityManager;}

    @Override
    public void save(Teacher teacher) {
        entityManager.persist(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        entityManager.merge(teacher);

    }

    @Override
    public void delete(Teacher teacher) {
        entityManager.remove(teacher.getIdProfesor());

    }

    @Override
    public void findById(Teacher id) {
        entityManager.find(Enrollment.class, id);
    }
}
