package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Horarios;

public interface ScheduleRepContract {
    void findById(Integer id);
    void save(Horarios horarios);

    void update(Horarios horarios);

    void delete(Integer id);

}
