package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.UserAdmin;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class UserAdminRepository implements UserAdminRepositoryContract{
    private final Map<Long, UserAdmin> userAdmin = new HashMap<>();
    private EntityManager entityManager;

    public UserAdminRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<UserAdmin> allUserAdmin() {
        return null;
    }

    @Override
    public UserAdmin findByNameUserAdmin(UserAdmin userAdmin) {
        if(userAdmin == null) {
            return null;
        }
        return entityManager.find(UserAdmin.class, userAdmin.getNombreUsuario());
    }

    @Override
    public UserAdmin save(UserAdmin userAdmin) {
        return null;
    }

    @Override
    public void update(UserAdmin userAdmin) {

    }

    @Override
    public UserAdmin delete(UserAdmin userAdmin) {
        return null;
    }
}
