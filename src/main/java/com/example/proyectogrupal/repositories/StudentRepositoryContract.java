package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Student;

import java.util.List;

public interface StudentRepositoryContract {
    List<Student> allEstudents();
    Student findByNameEstudent(String claseName);
    Student save(Student student);
    void update(Student student);
    void delete(String nameEstudet);
}
