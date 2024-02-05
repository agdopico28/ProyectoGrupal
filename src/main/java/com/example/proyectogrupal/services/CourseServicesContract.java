package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Course;

import java.util.List;

public interface CourseServicesContract {
    List<Course> allCourses();
    Course findByName(String courseName);
    Course save (Course course);
    void update (Course course);
    void delete (String nameCourse);
}
