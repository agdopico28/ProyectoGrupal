package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "clase", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_matricula"})
})
public class Clase implements Serializable {
    @Id
    @Column(name = "id_clase")
    private Long idClase;

    @OneToOne
    @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "id_matricula", referencedColumnName = "id_matricula")
    private Matricula matricula;

    @Column(name = "nombre_clase")
    private String nombreClase;
    @Column(name = "color")
    private String color;


    public Clase(Long id_clase, Profesor profesor, Curso curso, Matricula matricula, String nombre_clase, String color) {
        this.idClase = id_clase;
        this.profesor = profesor;
        this.curso = curso;
        this.matricula = matricula;
        this.nombreClase = nombre_clase;
        this.color = color;
    }

    public Clase() {
    }

    public Long getIdClase() {
        return idClase;
    }

    public void setIdClase(Long idClase) {
        this.idClase = idClase;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombre_clase) {
        this.nombreClase = nombre_clase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}