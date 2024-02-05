package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Student;

import java.util.List;

public interface StudentServicesContract {
    List<Student> allEstudents();
    Student findByNameEstudent(Student student);
    Student save(Student estudent);
    void update(Student student);
    Student delete(Student student);
}
