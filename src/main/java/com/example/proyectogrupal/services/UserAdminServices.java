package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.UserAdmin;
import com.example.proyectogrupal.repositories.UserAdminRepositoryContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAdminServices implements UserAdminServicesContract {
    private final UserAdminRepositoryContract userAdminRep;

    public UserAdminServices(UserAdminRepositoryContract userAdminRep) {
        this.userAdminRep = userAdminRep;
    }

    @Override
    public List<UserAdmin> allUserAdmin() {
        return userAdminRep.allUserAdmin();
    }

    @Override
    public UserAdmin findByNameUserAdmin(String classUserAdmin) {
        return userAdminRep.findByNameUserAdmin(classUserAdmin);
    }

    @Override
    public UserAdmin save(UserAdmin userAdmin) {
        return userAdminRep.save(userAdmin);
    }

    @Override
    public void update(UserAdmin userAdmin) {
        userAdminRep.update(userAdmin);
    }

    @Override
    public void delete(String userAdminName) {
        userAdminRep.delete(userAdminName);
    }
}
