package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Student;

import java.util.List;

public interface StudentRepositoryContract {
    List<Student> allStudents();
    Student findByNameStudent(String studentName);
    Student save(Student student);
    void update(Student student);
    void deleteByNameStudent(String studentName);
}
