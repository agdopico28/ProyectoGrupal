package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Student;

import java.util.List;

public interface StudentServicesContract {
    List<Student> allStudents();
    Student findByNameStudent(String studentName);
    Student save(Student student);
    void update(Student student);
    void deleteByNameStudent(String studentName);
}
