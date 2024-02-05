package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Enrollment;
import com.example.proyectogrupal.entity.Student;
import com.example.proyectogrupal.services.EnrollmentServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/matricula")
public class EnrollmentController {
    private final EnrollmentServicesContract enrollmentServicesContract;

    @Autowired
    public EnrollmentController(EnrollmentServicesContract enrollmentServicesContract) {
        this.enrollmentServicesContract = enrollmentServicesContract;
    }

    @GetMapping
    public List<Enrollment> allEnrollment() {
        return enrollmentServicesContract.allEnrollment();
    }

    @PostMapping("/update/{name}")
    public void modify(@RequestBody Enrollment enrollment) {
        enrollmentServicesContract.update(enrollment);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        enrollmentServicesContract.delete(id);
    }
}
