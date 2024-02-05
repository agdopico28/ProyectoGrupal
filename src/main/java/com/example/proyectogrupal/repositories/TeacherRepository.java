package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Teacher;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherRepository implements TeacherRepositoryContract{
    private final Map<Long, Teacher> teachers = new HashMap<>();
    private EntityManager entityManager;

    public TeacherRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Teacher> allTeachers() {
        return new ArrayList<>(teachers.values());
    }

    @Override
    public Teacher findByNameTeacher(Teacher teacher) {
        if(teacher == null) {
            return null;
        }
        return entityManager.find(Teacher.class, teacher.getNombre());
    }

    @Override
    public Teacher save(Teacher teacher) {
        if (teacher.getIdProfesor() == null) {
            entityManager.persist(teacher);
        }
        return teacher;
    }

    @Override
    public void update(Teacher teacher) {
        entityManager.merge(teacher);
    }

    @Override
    public Teacher delete(Teacher teacher) {
        if(teacher.getNombre() != null) {
            entityManager.remove(teacher);
        }
        return teacher;
    }
}
