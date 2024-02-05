package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Schedule;

import java.util.List;

public interface ScheduleServicesContract {
    List<Schedule> allSchedule();
    Schedule findById(Integer id);
    void save(Schedule schedule);
    void update(Schedule schedule);
    void delete(Integer id);
}
