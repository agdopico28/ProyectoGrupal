package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Enrollment;
import com.example.proyectogrupal.repositories.EnrollmentRepositoryContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServices implements EnrollmentServicesContract{
    private final EnrollmentRepositoryContract enrollmentRep;

    public EnrollmentServices(EnrollmentRepositoryContract enrollmentRep) {
        this.enrollmentRep = enrollmentRep;
    }

    @Override
    public List<Enrollment> allEnrollment() {
        return enrollmentRep.allEnrollment();
    }

    @Override
    public Enrollment findByIdEnrollment(Integer id) {
        return enrollmentRep.findByIdEnrollment(id);
    }

    @Override
    public Enrollment save(Enrollment enrollment) {
        return enrollmentRep.save(enrollment);
    }

    @Override
    public void update(Enrollment enrollment) {
        enrollmentRep.update(enrollment);
    }

    @Override
    public void delete(Long id) {
        enrollmentRep.delete(id);
    }
}
