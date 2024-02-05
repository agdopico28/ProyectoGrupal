package com.example.proyectogrupal.repositories;

import com.example.proyectogrupal.entity.Estudent;
import com.example.proyectogrupal.entity.UserAdmin;

import java.util.List;

public interface UserAdminRepositoryContract {
    List<UserAdmin> allUserAdmin();
    UserAdmin findByNameUserAdmin(UserAdmin userAdmin);
    UserAdmin save(UserAdmin userAdmin);
    void update(UserAdmin userAdmin);
    UserAdmin delete(UserAdmin userAdmin);
}
