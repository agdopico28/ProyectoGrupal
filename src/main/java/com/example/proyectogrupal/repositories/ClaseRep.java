package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Clase;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClaseRep implements ClaseRepContract {

    private final Map<Long, Clase> clases = new HashMap<>();
    private EntityManager entityManager;

    @Autowired
    public ClaseRep(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Clase> allClasses() {
         return new ArrayList<>(clases.values());
    }

    @Override
    public Clase findByNameClass(Clase clase) {
        if(clase != null) {
            return entityManager.find(Clase.class, clase.getNombre_clase());
        }
        return null;
    }
    @Override
    public void save(Clase clase) {
        entityManager.persist(clase);
    }

    @Override
    public void update(Clase clase) {
        entityManager.merge(clase);
    }

    @Override
    public void delete(Integer id) {
        Clase clase = entityManager.find(Clase.class, id);
        if (clase != null) {
            entityManager.remove(clase);
        }
    }
}
