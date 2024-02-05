package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.repositories.CourseRepositoryContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServices implements CourseServicesContract {
    private final CourseRepositoryContract courseRep;

    public CourseServices(CourseRepositoryContract courseRepositoryContract) {
        this.courseRep = courseRepositoryContract;
    }

    @Override
    public List<Course> allCourses() {
        return courseRep.allCourses();
    }

    @Override
    public Course findByName(Course course) {
        return courseRep.findByName(course);
    }

    @Override
    public Course save(Course course) {
        return courseRep.save(course);
    }

    @Override
    public void update(Course course) {
        courseRep.update(course);
    }

    @Override
    public Course delete(Course course) {
        return courseRep.delete(course);
    }
}
