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
    public Course findByNameCourse(String courseName) {
        if(courseName == null) {
            return null;
        }
        List<Course> courses = entityManager.createQuery("SELECT c FROM Course c WHERE c.nombreCurso = :courseName", Course.class)
                .setParameter("courseName", courseName)
                .getResultList();

        return courses.isEmpty() ? null : courses.get(0);
    }


    @Override
    public Course save(Course course) {
        if (course.getIdCurso() == null) {
            entityManager.persist(course);
            return course;
        }else{
            return entityManager.merge(course);
        }
    }

    @Override
    public void update(Course course) {
        entityManager.merge(course);
    }

    @Override
    public void delete(String courseName) {
        if(courseName != null) {
            // Buscar la entidad por nombre
            Course course = entityManager.createQuery("SELECT c FROM Course c WHERE c.nombreCurso = :courseName", Course.class)
                    .setParameter("courseName", courseName)
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null);

            // Si la entidad existe, eliminarla
            if(course != null) {
                entityManager.remove(entityManager.contains(course) ? course : entityManager.merge(course));
            }
        }
    }
}