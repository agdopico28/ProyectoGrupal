package com.example.proyectogrupal.modal.daoUsuarioAdmin;

import com.example.proyectogrupal.modal.entity.UsuarioAdmin;

public interface IUsuarioAdminDao {
    void save(UsuarioAdmin usuarioAdmin);
    void update(UsuarioAdmin usuarioAdmin);
    void delete(UsuarioAdmin UsuarioAdmin);
    void findById(Integer id);
}
