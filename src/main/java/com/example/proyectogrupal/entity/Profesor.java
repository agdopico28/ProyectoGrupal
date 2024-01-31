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
    private String id_profesor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombre_usuario")
    private String nombre_usuario;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "nif")
    private String nif;

    @Column(name = "email")
    private String email;

    public Profesor(String id_profesor, String nombre, String nombre_usuario, int telefono, String nif, String email) {
        this.id_profesor = id_profesor;
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.telefono = telefono;
        this.nif = nif;
        this.email = email;
    }

    public Profesor() {

    }

    public String getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(String id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
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


