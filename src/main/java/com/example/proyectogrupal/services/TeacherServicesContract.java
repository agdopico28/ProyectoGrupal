package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Teacher;

import java.util.List;

public interface TeacherServicesContract {
    List<Teacher> allTeachers();
    Teacher findById(Long id);
    Teacher findByUsername(String username);
    Teacher save(Teacher teacher);
    void update(Teacher teacher);
    void delete(Long id);
}
