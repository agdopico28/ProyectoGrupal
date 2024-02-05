package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Student;
import com.example.proyectogrupal.repositories.StudentRepositoryContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices implements StudentServicesContract {
    private final StudentRepositoryContract studentRepositoryContract;

    public StudentServices(StudentRepositoryContract studentRepositoryContract) {
        this.studentRepositoryContract = studentRepositoryContract;
    }

    @Override
    public List<Student> allStudents() {
        return studentRepositoryContract.allStudents();
    }

    @Override
    public Student findByNameStudent(String studentName) {
        return studentRepositoryContract.findByNameStudent(studentName);
    }

    @Override
    public Student save(Student student) {
        return studentRepositoryContract.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepositoryContract.update(student);
    }

    @Override
    public void deleteByNameStudent(String nameStudent) {
        studentRepositoryContract.deleteByNameStudent(nameStudent);
    }
}
