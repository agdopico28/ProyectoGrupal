package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "profesor", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"nif", "email"})
})
public class Profesor implements Serializable {
    @Id
    @Column(name = "id_profesor")
    private String idProfesor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "nif")
    private String nif;

    @Column(name = "email")
    private String email;

    public Profesor(String idProfesor, String nombre, String nombreUsuario, int telefono, String nif, String email) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.nif = nif;
        this.email = email;
    }

    public Profesor() {

    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


