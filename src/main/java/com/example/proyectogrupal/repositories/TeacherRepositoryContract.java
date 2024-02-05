package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Teacher;

import java.util.List;

public interface TeacherRepositoryContract  {
    List<Teacher> allTeachers();
    Teacher findByNameTeacher(String classTeacher);
    Teacher save(Teacher teacher);
    void update(Teacher teacher);
    void delete(String teacherName);
}
