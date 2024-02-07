package com.example.proyectogrupal.services;

import com.example.proyectogrupal.entity.UserAdmin;

import java.util.List;

public interface UserAdminServicesContract {
    List<UserAdmin> allUserAdmin();
    UserAdmin findByNameUserAdmin(String userAdminName);
    UserAdmin save(UserAdmin userAdmin);
    void update(UserAdmin userAdmin);
    void delete(String userAdminName);
}
