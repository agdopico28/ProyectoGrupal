package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Curso;
import com.example.proyectogrupal.repositories.CourseRepContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServ implements CourseServContract {
    private final CourseRepContract courseRep;

    public CourseServ(CourseRepContract courseRepContract) {
        this.courseRep = courseRepContract;
    }

    @Override
    public List<Curso> allCourses() {
        return courseRep.allCourses();
    }

    @Override
    public Curso findByName(Curso curso) {
        return courseRep.findByName(curso);
    }

    @Override
    public Curso save(Curso curso) {
        return courseRep.save(curso);
    }

    @Override
    public void update(Curso curso) {
        courseRep.update(curso);
    }

    @Override
    public Curso delete(Curso curso) {
        return courseRep.delete(curso);
    }
}
