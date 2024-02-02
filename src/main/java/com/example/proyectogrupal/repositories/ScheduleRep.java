package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Horarios;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ScheduleRep implements ScheduleRepContract{
    private EntityManager entityManager;

    private final Map<Long,Horarios> horarios = new HashMap<>();
    public ScheduleRep(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Horarios> allSchedule() {
        return new ArrayList<>(horarios.values());
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(Horarios.class, id);
    }

    @Override
    public void save(Horarios horarios) {
        entityManager.persist(horarios);
    }

    @Override
    public void update(Horarios horarios) {
        entityManager.merge(horarios);
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(id);
    }
}
