package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.services.CourseServicesContract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/courses")
public class CourseController {
    private final CourseServicesContract courseServicesContract;

    public CourseController(CourseServicesContract courseServicesContract) {
        this.courseServicesContract = courseServicesContract;
    }

    @GetMapping
    public List<Course> allCourses() {
        return courseServicesContract.allCourses();
    }

    @PostMapping
    public Course save(@RequestBody Course course) {
        return courseServicesContract.save(course);
    }

    @PutMapping("/update/{name}")
    public void modify(@RequestBody Course course) {
        courseServicesContract.update(course);
    }

    @DeleteMapping("/delete/{nombre}")
    public void delete(@PathVariable String classCourse) {
        courseServicesContract.delete(classCourse);
    }
}
