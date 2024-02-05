package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Schedule;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ScheduleRepository implements ScheduleRepositoryContract {
    private EntityManager entityManager;

    private final Map<Long, Schedule> horarios = new HashMap<>();
    public ScheduleRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Schedule> allSchedule() {
        return new ArrayList<>(horarios.values());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(Schedule.class, id);
    }

    @Override
    public void save(Schedule schedule) {
        entityManager.persist(schedule);
    }

    @Override
    public void update(Schedule schedule) {
        entityManager.merge(schedule);
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(id);
    }
}
