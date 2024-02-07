package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Enrollment;

import java.util.List;

public interface EnrollmentRepositoryContract {
    List<Enrollment> allEnrollment();
    Enrollment findByIdEnrollment(Long id);
    Enrollment findByEnrollment(Long userId, Long courseId);
    Enrollment save (Enrollment enrollment);
    void update (Enrollment enrollment);
    void delete (Long id);
}
