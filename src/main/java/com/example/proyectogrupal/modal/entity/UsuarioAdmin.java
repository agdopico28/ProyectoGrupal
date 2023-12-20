package com.example.proyectogrupal.modal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "user admin")
public class UsuarioAdmin implements Serializable {
    @Id
    @Column(name = "id_usuario_admin")
    private int id_usuario_admin;

    @Column(name = "nombre_usuario")
    private String nombre_usuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contraseña;

    public UsuarioAdmin(int id_usuario_admin, String nombre_usuario, String nombre,
                        String email, String contraseña) {
        this.id_usuario_admin = id_usuario_admin;
        this.nombre_usuario = nombre_usuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public UsuarioAdmin() {

    }


    public int getId_usuario_admin() {
        return id_usuario_admin;
    }

    public void setId_usuario_admin(int id_usuario_admin) {
        this.id_usuario_admin = id_usuario_admin;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}