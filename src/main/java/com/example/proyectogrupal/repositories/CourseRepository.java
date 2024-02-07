package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CourseRepository implements CourseRepositoryContract {

    private final EntityManager entityManager;

    @Autowired
    public CourseRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Course> allCourses() {
        return entityManager.createQuery("SELECT c FROM Course c", Course.class)
                .getResultList();
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
        } else {
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
            entityManager.createQuery("DELETE FROM Course c WHERE c.nombreCurso = :courseName")
                    .setParameter("courseName", courseName)
                    .executeUpdate();
        }
    }
}
