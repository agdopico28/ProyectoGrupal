package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;

import java.util.List;

public interface CourseRepositoryContract {
    List<Course> allCourses();
    Course findByNameCourse(String classCourse);
    Course save (Course course);
    void update (Course course);
    void delete (String nameCourse);
}
