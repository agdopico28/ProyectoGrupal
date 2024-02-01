package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "estudiante", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"dni", "email"})}
)

public class Estudiante implements Serializable {

    @Id
    @Column(name="id_estudiante")
    private Long id_estudiante;

    @Column(name="nombre_usuario")
    private String nombre_usuario;

    @Column(name="contrasenya")
    private String contrasenya;

    @Column(name="email")
    private String email;

    @Column(name="nombre_estudiante")
    private String nombre_estudiante;

    @Column(name="apellido_estudiante")
    private String apellido_estudiante;

    @Column(name="telefono")
    private int telefono;

    @Column(name="dni")
    private String dni;

    @Column(name="fecha_registro")
    private Date fecha_registro;

    public Estudiante(Long id_estudiante, String nombre_usuario, String contrasenya, String email, String nombre_estudiante,
                      String apellido_estudiante, int telefono, String dni, Date fecha_registro) {

        this.id_estudiante = id_estudiante;
        this.nombre_usuario = nombre_usuario;
        this.contrasenya = contrasenya;
        this.email = email;
        this.nombre_estudiante = nombre_estudiante;
        this.apellido_estudiante = apellido_estudiante;
        this.telefono = telefono;
        this.dni = dni;
        this.fecha_registro = fecha_registro;
    }

    public Estudiante() {

    }

    public Long getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Long id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
