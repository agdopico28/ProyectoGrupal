package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Course;

import java.util.List;

public interface CourseServicesContract {
    List<Course> allCourses();
    Course findByName(Course course);
    Course save (Course course);
    void update (Course course);
    Course delete (Course course);
}
