package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Student;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class StudentRepository implements StudentRepositoryContract {
    private final Map<Long, Student> estudents = new HashMap<>();
    private EntityManager entityManager;

    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> allStudents() {
        return new ArrayList<>(estudents.values());
    }

    @Override
    public Student findByNameStudent(String studentName) {
        if(studentName == null) {
            return null;
        }
        List<Student> students = entityManager.createQuery("SELECT s FROM Student s WHERE s.nombreEstudiante = :studentName", Student.class)
                .setParameter("studentName", studentName)
                .getResultList();

        return students.isEmpty() ? null : students.get(0);
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
    public void deleteByNameStudent(String studentName) {
        if(studentName != null) {
            List<Student> students = entityManager.createQuery(
                    "SELECT s FROM Student s WHERE s.nombreEstudiante = :nombreEstudiante", Student.class)
                    .setParameter("nombreEstudiante", studentName)
                    .getResultList();

            for (Student student : students) {
                entityManager.remove(entityManager.contains(student) ? student : entityManager.merge(student));
            }
        }
    }
}
