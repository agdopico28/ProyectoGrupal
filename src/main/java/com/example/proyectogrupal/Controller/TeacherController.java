package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Teacher;
import com.example.proyectogrupal.services.TeacherServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherServicesContract teacherServices;

    @Autowired
    public TeacherController(TeacherServicesContract teacherServices) {
        this.teacherServices = teacherServices;
    }

    @GetMapping
    public List<Teacher> allTeachers() {
        return teacherServices.allTeachers();
    }

    @PostMapping
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherServices.save(teacher);
    }

    @PutMapping("/update/{id}")
    public void modify(@RequestBody Teacher teacher, @PathVariable Long id) {
        teacher.setIdProfesor(id);
        teacherServices.update(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        teacherServices.delete(id);
    }
}
