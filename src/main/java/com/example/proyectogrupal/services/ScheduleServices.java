package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.Schedule;

import java.util.List;

public class ScheduleServices implements ScheduleServicesContract {
    private final ScheduleServicesContract scheduleRep;

    public ScheduleServices(ScheduleServicesContract scheduleRep) {
        this.scheduleRep = scheduleRep;
    }

    @Override
    public List<Schedule> allSchedule() {
        return scheduleRep.allSchedule();
    }

    @Override
    public void findById(Integer id) {
        scheduleRep.findById(id);
    }

    @Override
    public void save(Schedule schedule) {
        scheduleRep.save(schedule);
    }

    @Override
    public void update(Schedule schedule) {
        scheduleRep.update(schedule);
    }

    @Override
    public void delete(Integer id) {
        scheduleRep.delete(id);
    }
}
