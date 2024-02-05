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
public class ClaseRepository implements ClaseRepositoryContract {
    private final Map<Long, Clase> clases = new HashMap<>();
    private EntityManager entityManager;

    @Autowired
    public ClaseRepository(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Clase> allClasses() {
         return new ArrayList<>(clases.values());
    }

    @Override
    public Clase findByNameClass(String claseName) {
        if(claseName == null) {
            return null;
        }
        List<Clase> clases = entityManager.createQuery("SELECT c FROM Clase c WHERE c.nombreClase = :nombreClase", Clase.class)
                .setParameter("nombreClase", claseName)
                .getResultList();

        return clases.isEmpty() ? null : clases.get(0);
    }

    @Override
    public Clase save(Clase clase) {
        if (clase.getIdClase() == null) {
            // La entidad es nueva, por lo tanto, persistirla
            entityManager.persist(clase);
            return clase; // Persist crea la entidad pero no devuelve una instancia gestionada
        } else {
            // La entidad ya existe, por lo tanto, actualizarla
            return entityManager.merge(clase); // Merge actualiza la entidad y devuelve una instancia gestionada
        }
    }

    @Override
    public void update(Clase clase) {
        entityManager.merge(clase);
    }

    @Override
    public void delete(String claseName) {
        if(claseName != null) {
            // Buscar la entidad por nombre
            Clase clase = entityManager.createQuery("SELECT c FROM Clase c WHERE c.nombreClase = :nombre", Clase.class)
                    .setParameter("nombre", claseName)
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null);

            // Si la entidad existe, eliminarla
            if(clase != null) {
                entityManager.remove(entityManager.contains(clase) ? clase : entityManager.merge(clase));
            }
        }
    }
}
