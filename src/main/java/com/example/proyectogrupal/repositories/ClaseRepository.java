package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Clase;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClaseRepository implements ClaseRepositoryContract {
    private EntityManager entityManager;

    @Autowired
    public ClaseRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Clase> allClasses() {
        return entityManager.createQuery("select c from Clase c", Clase.class)
                .getResultList();
    }

    @Override
    public Clase findById(Long id) {
        return entityManager.find(Clase.class, id);
    }

    @Override
    public Clase findByName(String className) {
        if(className == null) {
            return null;
        }
        List<Clase> clases = entityManager.createQuery("SELECT c FROM Clase c WHERE c.nombreClase = :nombreClase", Clase.class)
                .setParameter("nombreClase", className)
                .getResultList();

        return clases.isEmpty() ? null : clases.get(0);
    }

    @Override
    public Clase save(Clase clase) {
        if (clase.getIdClase() == null) {
            entityManager.persist(clase);
            return clase;
        } else {
            return entityManager.merge(clase);
        }
    }

    @Override
    public void update(Clase clase) {
        entityManager.merge(clase);
    }

    @Override
    public void delete(Long id) {
        if (id != null) {
            Clase clase = entityManager.find(Clase.class, id);
            if (clase != null) {
                entityManager.remove(clase);
            }
        }
    }
}
