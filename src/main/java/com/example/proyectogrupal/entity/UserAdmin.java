package com.example.proyectogrupal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "user admin")
public class UserAdmin implements Serializable {
    @Id
    @Column(name = "id_usuario_admin")
    private int idUsuarioAdmin;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contrasenya;

    public UserAdmin(int idUsuarioAdmin, String nombreUsuario, String nombre,
                     String email, String contrasenya) {
        this.idUsuarioAdmin = idUsuarioAdmin;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contrasenya = contrasenya;
    }

    public UserAdmin() {

    }


    public int getIdUsuarioAdmin() {
        return idUsuarioAdmin;
    }

    public void setIdUsuarioAdmin(int idUsuarioAdmin) {
        this.idUsuarioAdmin = idUsuarioAdmin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contraseña) {
        this.contrasenya = contraseña;
    }
}