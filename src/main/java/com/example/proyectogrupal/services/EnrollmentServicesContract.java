package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Enrollment;

import java.util.List;

public interface EnrollmentServicesContract {
    List<Enrollment> allEnrollment();
    void findByIdEnrollment(Integer id);
    void save (Enrollment enrollment);
    void update (Enrollment enrollment);
    void delete (Integer id);
}
