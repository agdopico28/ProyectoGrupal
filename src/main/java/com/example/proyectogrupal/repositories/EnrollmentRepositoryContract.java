package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.entity.Enrollment;

import java.util.List;

public interface EnrollmentRepositoryContract {

    List<Enrollment> allEnrollment();
    void findByIdEnrollment(Integer id);
    void save (Enrollment enrollment);
    void update (Enrollment enrollment);
    void delete (Integer id);
}
