package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeacherServicesContract{
    List<Teacher> allTeachers();
    Teacher findByNameTeacher(String classTeacher);
    Teacher save(Teacher teacher);
    void update(Teacher teacher);
    void delete(String teacherName);
}
