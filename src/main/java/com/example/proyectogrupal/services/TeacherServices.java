package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Teacher;
import com.example.proyectogrupal.repositories.TeacherRepositoryContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServices implements TeacherServicesContract {
    private final TeacherRepositoryContract teacherRepository;

    public TeacherServices(TeacherRepositoryContract teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> allTeachers() {
        return teacherRepository.allTeachers();
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByUsername(String username) {
        return teacherRepository.findByUsername(username);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.update(teacher);
    }

    @Override
    public void delete(Long id) {
        teacherRepository.delete(id);
    }
}
