package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Enrollment;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EnrollmentRepository implements EnrollmentRepositoryContract{
    private final Map<Long, Enrollment> enrollments = new HashMap<>();
    private EntityManager entityManager;

    public EnrollmentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Enrollment> allEnrollment() {
        return new ArrayList<>(enrollments.values());
    }

    @Override
    public Enrollment findByIdEnrollment(Integer id) {
        if(id == null) {
            return null;
        }
        return entityManager.find(Enrollment.class, id);
    }

    @Override
    public Enrollment save(Enrollment enrollment) {
        if (enrollment.getIdEnrollment() == null) {

            entityManager.persist(enrollment);
            return enrollment;

        } else {
            return entityManager.merge(enrollment);
        }
    }

    @Override
    public void update(Enrollment enrollment) {
        entityManager.merge(enrollment);
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            entityManager.remove(id);
        }
    }
}
