package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Student;
import com.example.proyectogrupal.services.StudentServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentServicesContract studentServicesContract;

    @Autowired
    public StudentController(StudentServicesContract studentServicesContract) {
        this.studentServicesContract = studentServicesContract;
    }

    @GetMapping
    public List<Student> allStudents() {
        return studentServicesContract.allStudents();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentServicesContract.save(student);
    }

    @PutMapping("/update/{name}")
    public void modify(@RequestBody Student student) {
        studentServicesContract.update(student);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteByNameStudent(@PathVariable String studentName) {
        studentServicesContract.deleteByNameStudent(studentName);
    }
}
