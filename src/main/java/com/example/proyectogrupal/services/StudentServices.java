package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Enrollment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices implements EnrollmentServicesContract{
    private final EnrollmentServicesContract enrollmentRep;

    public StudentServices(EnrollmentServicesContract enrollmentRep) {
        this.enrollmentRep = enrollmentRep;
    }

    @Override
    public List<Enrollment> allEnrollment() {
        return enrollmentRep.allEnrollment();
    }

    @Override
    public void findByIdEnrollment(Integer id) {
        enrollmentRep.findByIdEnrollment(id);
    }

    @Override
    public void save(Enrollment enrollment) {
        enrollmentRep.save(enrollment);
    }

    @Override
    public void update(Enrollment enrollment) {
        enrollmentRep.update(enrollment);
    }

    @Override
    public void delete(Integer id) {
        enrollmentRep.delete(id);
    }
}
