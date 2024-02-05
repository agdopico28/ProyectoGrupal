package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Student;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepository implements StudentRepositoryContract {
    private final Map<Long, Student> estudents = new HashMap<>();
    private EntityManager entityManager;

    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> allEstudents() {
        return new ArrayList<>(estudents.values());
    }

    @Override
    public Student findByNameEstudent(Student student) {
        if(student == null) {
            return null;
        }
        return entityManager.find(Student.class, student.getNombreEstudiante());
    }

    @Override
    public Student save(Student student) {
        if (student.getIdEstudiante() == null) {
            entityManager.persist(student);
        }
        return student;
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public Student delete(Student student) {
        if(student.getNombreEstudiante() != null) {
            entityManager.remove(student);
        }
        return student;
    }
}
