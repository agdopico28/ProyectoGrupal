package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "estudiante", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"dni", "email"})}
)

public class Student implements Serializable {

    @Id
    @Column(name="id_estudiante")
    private Long idEstudiante;

    @Column(name="nombre_usuario")
    private String nombreUsuario;

    @Column(name="contrasenya")
    private String contrasenya;

    @Column(name="email")
    private String email;

    @Column(name="nombre_estudiante")
    private String nombreEstudiante;

    @Column(name="apellido_estudiante")
    private String apellidoEstudiante;

    @Column(name="telefono")
    private int telefono;

    @Column(name="dni")
    private String dni;

    @Column(name="fecha_registro")
    private Date fechaRegistro;

    public Student(Long idEstudiante, String nombreUsuario, String contrasenya, String email, String nombreEstudiante,
                   String apellidoEstudiante, int telefono, String dni, Date fechaRegistro) {

        this.idEstudiante = idEstudiante;
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.email = email;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.telefono = telefono;
        this.dni = dni;
        this.fechaRegistro = fechaRegistro;
    }

    public Student() {

    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
