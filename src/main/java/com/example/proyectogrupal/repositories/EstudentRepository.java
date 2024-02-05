package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Course;
import com.example.proyectogrupal.entity.Estudent;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstudentRepository implements EstudentRepositoryContract{
    private final Map<Long, Estudent> estudents = new HashMap<>();
    private EntityManager entityManager;

    public EstudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Estudent> allEstudents() {
        return new ArrayList<>(estudents.values());
    }

    @Override
    public Estudent findByNameEstudent(Estudent estudent) {
        if(estudent == null) {
            return null;
        }
        return entityManager.find(Estudent.class, estudent.getNombreEstudiante());
    }

    @Override
    public Estudent save(Estudent estudent) {
        if (estudent.getIdEstudiante() == null) {
            entityManager.persist(estudent);
        }
        return estudent;
    }

    @Override
    public void update(Estudent estudent) {
        entityManager.merge(estudent);
    }

    @Override
    public Estudent delete(Estudent estudent) {
        if(estudent.getNombreEstudiante() != null) {
            entityManager.remove(estudent);
        }
        return estudent;
    }
}
