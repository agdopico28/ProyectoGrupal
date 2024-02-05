package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.entity.Teacher;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
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
    public Teacher findByNameTeacher(String classTeacher) {
        if(classTeacher == null) {
            return null;
        }
        List<Teacher> teachers = entityManager.createQuery("SELECT t FROM Teacher t WHERE t.nombre = :nombre", Teacher.class)
                .setParameter("nombre", classTeacher)
                .getResultList();

        return teachers.isEmpty() ? null : teachers.get(0);
    }

    @Override
    public Teacher save(Teacher teacher) {
        if (teacher.getIdProfesor() == null) {
            entityManager.persist(teacher);
            return teacher;
        }else {
            return  entityManager.merge(teacher);
        }

    }

    @Override
    public void update(Teacher teacher) {
        entityManager.merge(teacher);
    }

    @Override
    public  void delete(String teacherName) {
        if(teacherName != null) {
            // Buscar la entidad por nombre
            Teacher teacher = entityManager.createQuery("SELECT t FROM Teacher t WHERE t.nombre= :teacherName", Teacher.class)
                    .setParameter("teacherName", teacherName)
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null);

            // Si la entidad existe, eliminarla
            if(teacher != null) {
                entityManager.remove(entityManager.contains(teacher) ? teacher : entityManager.merge(teacher));
            }
        }
    }

}
