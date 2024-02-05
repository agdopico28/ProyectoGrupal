package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Schedule;

import java.util.List;

public interface ScheduleRepositoryContract {
    List<Schedule> allSchedule();
    void findById(Integer id);
    void save(Schedule schedule);
    void update(Schedule schedule);
    void delete(Integer id);

}
