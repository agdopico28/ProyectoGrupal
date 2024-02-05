package com.example.proyectogrupal.modal.daoMatriculaDao;

import com.example.proyectogrupal.entity.Enrollment;
import com.example.proyectogrupal.entity.Teacher;
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
    public void save(Enrollment enrollment) {
        entityManager.persist(enrollment);
    }

    @Override
    public void update(Enrollment enrollment) {
        entityManager.merge(enrollment);

    }

    @Override
    public void delete(Enrollment enrollment) {
        entityManager.remove(enrollment.getIdMatricula());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(Teacher.class, id);
    }
}
