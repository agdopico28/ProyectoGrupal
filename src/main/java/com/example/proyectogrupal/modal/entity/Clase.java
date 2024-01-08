package com.example.proyectogrupal.modal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "clase", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_matricula"})
})
public class Clase implements Serializable {
    @Id
    @Column(name = "id_clase")
    private int id_clase;

    @OneToOne
    @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "id_horario", referencedColumnName = "id_horario")
    private Horarios horarios;

    @Column(name = "nombre_clase")
    private String nombre_clase;
    @Column(name = "color")
    private String color;


    public Clase(
            int id_clase,
            Profesor profesor,
            Curso curso,
            Horarios horarios,
            String nombre_clase,
            String color
    ) {
        this.id_clase = id_clase;
        this.profesor = profesor;
        this.curso = curso;
        this.horarios = horarios;
        this.nombre_clase = nombre_clase;
        this.color = color;
    }

    public Clase() {
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
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


    public Horarios getHorarios() {
        return horarios;
    }

    public void setHorarios(Horarios horarios) {
        this.horarios = horarios;
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
