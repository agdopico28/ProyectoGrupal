package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Clase;
import com.example.proyectogrupal.entity.Teacher;
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
    public UserAdmin findByNameUserAdmin(String classUserAdmin) {
        if(classUserAdmin == null) {
            return null;
        }
        List<UserAdmin> userAdmins = entityManager.createQuery("SELECT u FROM UserAdmin u WHERE u.nombreUsuario = :classUserAdmin", UserAdmin.class)
                .setParameter("classUserAdmin", classUserAdmin)
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
        if(userAdminName != null) {
            // Buscar la entidad por nombre
            UserAdmin userAdmin = entityManager.createQuery("SELECT u FROM UserAdmin u WHERE u.nombreUsuario= :userAdminName", UserAdmin.class)
                    .setParameter("userAdminName", userAdminName)
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null);

            // Si la entidad existe, eliminarla
            if(userAdmin != null) {
                entityManager.remove(entityManager.contains(userAdmin) ? userAdmin : entityManager.merge(userAdmin));
            }
        }
    }
}
