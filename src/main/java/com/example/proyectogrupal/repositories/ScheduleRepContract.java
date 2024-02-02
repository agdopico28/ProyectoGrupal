package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Horarios;

import java.util.List;

public interface ScheduleRepContract {
    List<Horarios> allSchedule();
    void findById(Integer id);
    void save(Horarios horarios);

    void update(Horarios horarios);

    void delete(Integer id);

}
