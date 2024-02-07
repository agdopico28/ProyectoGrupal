package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.UserAdmin;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserAdminRepository implements UserAdminRepositoryContract {
    private final EntityManager entityManager;

    public UserAdminRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<UserAdmin> allUserAdmin() {
        return entityManager.createQuery("SELECT u FROM UserAdmin u", UserAdmin.class).getResultList();
    }

    @Override
    public UserAdmin findByNameUserAdmin(String userAdminName) {
        if (userAdminName == null) {
            return null;
        }
        List<UserAdmin> userAdmins = entityManager.createQuery("SELECT u FROM UserAdmin u WHERE u.nombreUsuario = :userAdminName", UserAdmin.class)
                .setParameter("userAdminName", userAdminName)
                .getResultList();

        return userAdmins.isEmpty() ? null : userAdmins.get(0);
    }

    @Override
    public UserAdmin save(UserAdmin userAdmin) {
        if (userAdmin.getIdUsuarioAdmin() == null) {
            entityManager.persist(userAdmin);
            return userAdmin;
        } else {
            return entityManager.merge(userAdmin);
        }
    }

    @Override
    public void update(UserAdmin userAdmin) {
        entityManager.merge(userAdmin);
    }

    @Override
    public void delete(String userAdminName) {
        if (userAdminName != null) {
            UserAdmin userAdmin = findByNameUserAdmin(userAdminName);
            if (userAdmin != null) {
                entityManager.remove(userAdmin);
            }
        }
    }
}
