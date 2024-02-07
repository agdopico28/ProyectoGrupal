package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.services.CourseServicesContract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/courses")
public class CourseController {
    private final CourseServicesContract courseServicesContract;

    public CourseController(CourseServicesContract courseServicesContract) {
        this.courseServicesContract = courseServicesContract;
    }

    @GetMapping
    public String allCourses(Model model) {
        List<Course> courses = courseServicesContract.allCourses();
        model.addAttribute("cursos", courses);
        return "courses";
    }

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseServicesContract.save(course);
    }

    @PutMapping("/update/{name}")
    public void modify(@RequestBody Course course) {
        courseServicesContract.update(course);
    }

    @DeleteMapping("/delete/{courseName}")
    public void delete(@PathVariable String courseName) {
        courseServicesContract.delete(courseName);
    }
}
