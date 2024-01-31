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
    private Long id_clase;

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
    private String nombre_clase;
    @Column(name = "color")
    private String color;


    public Clase(Long id_clase, Profesor profesor, Curso curso, Matricula matricula, String nombre_clase, String color) {
        this.id_clase = id_clase;
        this.profesor = profesor;
        this.curso = curso;
        this.matricula = matricula;
        this.nombre_clase = nombre_clase;
        this.color = color;
    }

    public Clase() {
    }

    public Long getId_clase() {
        return id_clase;
    }

    public void setId_clase(Long id_clase) {
        this.id_clase = id_clase;
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

    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}