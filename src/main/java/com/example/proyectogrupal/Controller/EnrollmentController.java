package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.services.EnrollmentServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/matricula")
public class EnrollmentController {
    private final EnrollmentServicesContract enrollmentServicesContract;

    @Autowired
    public EnrollmentController(EnrollmentServicesContract enrollmentServicesContract) {
        this.enrollmentServicesContract = enrollmentServicesContract;
    }
}
