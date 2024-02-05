package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Teacher;
import com.example.proyectogrupal.repositories.TeacherRepositoryContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServices implements TeacherServicesContract {
    private final TeacherRepositoryContract teacherRep;

    public TeacherServices(TeacherRepositoryContract teacherRep) {
        this.teacherRep = teacherRep;
    }

    @Override
    public List<Teacher> allTeachers() {
        return teacherRep.allTeachers();
    }

    @Override
    public Teacher findByNameTeacher(String classTeacher) {
        return teacherRep.findByNameTeacher(classTeacher);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRep.save(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherRep.update(teacher);
    }

    @Override
    public void delete(String teacherName) {
        teacherRep.delete(teacherName);
    }
}
