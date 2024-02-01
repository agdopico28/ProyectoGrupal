package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Curso;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CourseRep implements CourseRepContract {

    private final Map<Long, Curso> courses = new HashMap<>();
    private EntityManager entityManager;

    @Autowired
    public CourseRep(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    @Override
    public List<Curso> allCourses() {
        return new ArrayList<>(courses.values());
    }

    @Override
    public Curso findByName(Curso curso) {
        if(curso == null) {
            return null;
        }
        return entityManager.find(Curso.class, curso.getNombreCurso());
    }

    @Override
    public Curso save(Curso curso) {
        if (curso.getIdCurso() == null) {
            entityManager.persist(curso);
        }
        return curso;
    }

    @Override
    public void update(Curso curso) {
        entityManager.merge(curso);
    }

    @Override
    public Curso delete(Curso curso) {
        if(curso.getNombreCurso() != null) {
            entityManager.remove(curso);
        }
        return curso;
    }
}
