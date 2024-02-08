package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Enrollment;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnrollmentRepository implements EnrollmentRepositoryContract {
    private final EntityManager entityManager;

    public EnrollmentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Enrollment> allEnrollment() {
        return entityManager.createQuery("SELECT e FROM Enrollment e", Enrollment.class)
                .getResultList();
    }

    @Override
    public Enrollment findByIdEnrollment(Long id) {
        return entityManager.find(Enrollment.class, id);
    }

    @Override
    public Enrollment findByEnrollment(Long userId, Long courseId) {
        return entityManager.createQuery(
                        "SELECT e FROM Enrollment e WHERE e.idUserAdmin.id = :userId AND e.course.idCurso = :courseId",
                        Enrollment.class)
                .setParameter("userId", userId)
                .setParameter("courseId", courseId)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
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
        Enrollment enrollment = entityManager.find(Enrollment.class, id);
        if (enrollment != null) {
            entityManager.remove(enrollment);
        }
    }
}
