package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.entity.Enrollment;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EnrollmentRepository implements EnrollmentRepositoryContract{
    private final Map<Long, Enrollment> enrollment = new HashMap<>();

    private EntityManager entityManager;

    public EnrollmentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Enrollment> allEnrollment() {
        return new ArrayList<>(enrollment.values());
    }

    @Override
    public void findByIdEnrollment(Integer id) {
        entityManager.find(Enrollment.class,id);
    }

    @Override
    public void save(Enrollment enrollment) {
        entityManager.persist(enrollment);
    }

    @Override
    public void update(Enrollment enrollment) {
        entityManager.merge(enrollment);
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(id);
    }
}
