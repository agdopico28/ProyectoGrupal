package com.example.proyectogrupal.modal.daoClase;

import com.example.proyectogrupal.entity.Clase;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsClaseDAO implements IClaseDAO{
    private EntityManager entityManager;

    @Autowired
    public ImplementsClaseDAO(EntityManager theEntityManager) {
        entityManager = theEntityManager;
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
        entityManager.remove(id);
    }

    @Override
    public void findById(Integer id) {
        entityManager.find(Clase.class,id);
    }
}
