package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CourseRepository implements CourseRepositoryContract {

    private final Map<Long, Course> courses = new HashMap<>();
    private EntityManager entityManager;

    @Autowired
    public CourseRepository(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    @Override
    public List<Course> allCourses() {
        return new ArrayList<>(courses.values());
    }

    @Override
    public Course findByName(Course course) {
        if(course == null) {
            return null;
        }
        return entityManager.find(Course.class, course.getNombreCurso());
    }

    @Override
    public Course save(Course course) {
        if (course.getIdCurso() == null) {
            entityManager.persist(course);
        }
        return course;
    }

    @Override
    public void update(Course course) {
        entityManager.merge(course);
    }

    @Override
    public Course delete(Course course) {
        if(course.getNombreCurso() != null) {
            entityManager.remove(course);
        }
        return course;
    }
}
