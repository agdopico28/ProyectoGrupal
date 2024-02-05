package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Student;
import com.example.proyectogrupal.entity.Teacher;
import com.example.proyectogrupal.services.TeacherServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherServicesContract teacherServicesContract;

    @Autowired
    public TeacherController(TeacherServicesContract teacherServicesContract) {
        this.teacherServicesContract = teacherServicesContract;
    }
    @GetMapping
    public List<Teacher> allTeachers() {
        return teacherServicesContract.allTeachers();
    }

    @PostMapping
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherServicesContract.save(teacher);
    }

    @PutMapping("/update/{name}")
    public void modify(@RequestBody Teacher teacher) {
        teacherServicesContract.update(teacher);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteByNameStudent(@PathVariable String teacherName) {
        teacherServicesContract.delete(teacherName);
    }
}
