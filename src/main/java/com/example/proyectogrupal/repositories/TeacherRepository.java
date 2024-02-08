package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Teacher;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeacherRepository implements TeacherRepositoryContract {
    private final EntityManager entityManager;

    public TeacherRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Teacher> allTeachers() {
        return entityManager.createQuery("SELECT t FROM Teacher t", Teacher.class)
                .getResultList();
    }

    @Override
    public Teacher findById(Long id) {
        if (id == null) {
            return null;
        }
        return entityManager.find(Teacher.class, id);
    }

    @Override
    public Teacher findByUsername(String username) {
        if (username == null) {
            return null;
        }
        List<Teacher> teachers = entityManager.createQuery("SELECT t FROM Teacher t WHERE t.nombreUsuario = :username", Teacher.class)
                .setParameter("username", username)
                .getResultList();
        return teachers.isEmpty() ? null : teachers.get(0);
    }

    @Override
    public Teacher save(Teacher teacher) {
        if (teacher.getIdProfesor() == null) {
            entityManager.persist(teacher);
            return teacher;
        } else {
            return entityManager.merge(teacher);
        }
    }

    @Override
    public void update(Teacher teacher) {
        entityManager.merge(teacher);
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            Teacher teacher = entityManager.find(Teacher.class, id);
            if (teacher != null) {
                entityManager.remove(teacher);
            }
        }
    }
}
