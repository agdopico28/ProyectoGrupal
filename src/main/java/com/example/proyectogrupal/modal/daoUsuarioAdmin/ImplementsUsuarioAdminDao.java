package com.example.proyectogrupal.modal.daoUsuarioAdmin;

import com.example.proyectogrupal.entity.UserAdmin;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ImplementsUsuarioAdminDao implements IUsuarioAdminDao{

    private final EntityManager entityManager;

    @Autowired
    public ImplementsUsuarioAdminDao(EntityManager theEntityManager) {entityManager = theEntityManager;}

    @Override
    @Transactional
    public void save(UserAdmin userAdmin) {
        entityManager.persist(userAdmin);

    }

    @Override
    public void update(UserAdmin userAdmin) {
        entityManager.merge(userAdmin);

    }

    @Override
    public void delete(UserAdmin userAdmin) {
        entityManager.remove(userAdmin.getIdUsuarioAdmin());

    }

    @Override
    public void findById(Integer id) {
        entityManager.find(UserAdmin.class, id);
    }
}
