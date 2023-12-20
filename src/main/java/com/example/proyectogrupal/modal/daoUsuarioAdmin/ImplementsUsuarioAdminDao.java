package com.example.proyectogrupal.modal.daoUsuarioAdmin;

import com.example.proyectogrupal.modal.entity.UsuarioAdmin;
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
    public void save(UsuarioAdmin usuarioAdmin) {
        entityManager.persist(usuarioAdmin);

    }

    @Override
    public void update(UsuarioAdmin usuarioAdmin) {
        entityManager.merge(usuarioAdmin);

    }

    @Override
    public void delete(UsuarioAdmin usuarioAdmin) {
        entityManager.remove(usuarioAdmin.getId_usuario_admin());

    }

    @Override
    public void findById(Integer id) {
        entityManager.find(UsuarioAdmin.class, id);
    }
}
