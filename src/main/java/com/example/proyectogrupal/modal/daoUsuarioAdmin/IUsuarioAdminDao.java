package com.example.proyectogrupal.modal.daoUsuarioAdmin;

import com.example.proyectogrupal.entity.UserAdmin;

public interface IUsuarioAdminDao {
    void save(UserAdmin userAdmin);
    void update(UserAdmin userAdmin);
    void delete(UserAdmin UserAdmin);
    void findById(Integer id);
}
