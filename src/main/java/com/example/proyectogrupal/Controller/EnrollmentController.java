package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Enrollment;
import com.example.proyectogrupal.services.EnrollmentServicesContract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/matricula")
public class EnrollmentController {
    private final EnrollmentServicesContract enrollmentServicesContract;

    public EnrollmentController(EnrollmentServicesContract enrollmentServicesContract) {
        this.enrollmentServicesContract = enrollmentServicesContract;
    }

    public List<Enrollment> allEnrollment() {
        return enrollmentServicesContract.allEnrollment();
    }


}
