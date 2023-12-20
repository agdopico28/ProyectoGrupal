package com.example.proyectogrupal.modals.daoHorario;

import com.example.proyectogrupal.modals.entity.Horarios;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ImplementsHorarioDAO implements IHorarioDAO{

    private EntityManager entityManager;

    @Autowired
    public ImplementsHorarioDAO(EntityManager theEntityManager) {
        entityManager = theEntityManager;
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

    @Override
    public void findById(Integer id) {
        entityManager.find(Horarios.class,id);
    }
}
