package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Teacher;
import com.example.proyectogrupal.services.TeacherServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherServicesContract teacherServicesContract;

    @Autowired
    public TeacherController(TeacherServicesContract teacherServicesContract) {
        this.teacherServicesContract = teacherServicesContract;
    }

    @GetMapping
    public String allTeachers(Model model) {
        List<Teacher> teachers = teacherServicesContract.allTeachers();
        model.addAttribute("profesores", teachers);
        return "teachers";
    }


    @PostMapping
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherServicesContract.save(teacher);
    }

    @PutMapping("/update/{id}")
    public void modify(@RequestBody Teacher teacher, @PathVariable Long id) {
        teacher.setIdProfesor(id);
        teacherServicesContract.update(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        teacherServicesContract.delete(id);
    }
}
