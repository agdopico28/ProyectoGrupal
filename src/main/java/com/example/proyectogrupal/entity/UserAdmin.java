package com.example.proyectogrupal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "user_admin")
public class UserAdmin implements Serializable {
    @Id
    @Column(name = "id_usuario_admin")
    private Long idUsuarioAdmin;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contraseña;

    public UserAdmin(Long idUsuarioAdmin, String nombreUsuario, String nombre,
                     String email, String contraseña) {
        this.idUsuarioAdmin = idUsuarioAdmin;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public UserAdmin() {

    }


    public Long getIdUsuarioAdmin() {
        return idUsuarioAdmin;
    }

    public void setIdUsuarioAdmin(Long idUsuarioAdmin) {
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}