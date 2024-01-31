package com.example.proyectogrupal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="curso")
public class Curso implements Serializable {

    @Id
    @Column(name="id_curso")
    private int id_curso;

    @Column(name="nombre_curso")
    private String nombre_curso;

    @Column(name="descripcion_curso")
    private String descripcion_curso;

    @Column(name="fecha_inicio_curso")
    private Date fecha_inicio_curso;

    @Column(name="fecha_fin_curso")
    private Date fecha_fin_curso;

    @Column(name="habilitar")
    private boolean habilitar;

    public Curso(int id_curso, String nombre_curso, String descripcion_curso, Date fecha_inicio_curso, Date fecha_fin_curso,
                 boolean habilitar) {

        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
        this.descripcion_curso = descripcion_curso;
        this.fecha_inicio_curso = fecha_inicio_curso;
        this.fecha_fin_curso = fecha_fin_curso;
        this.habilitar = habilitar;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getDescripcion_curso() {
        return descripcion_curso;
    }

    public void setDescripcion_curso(String descripcion_curso) {
        this.descripcion_curso = descripcion_curso;
    }

    public Date getFecha_inicio_curso() {
        return fecha_inicio_curso;
    }

    public void setFecha_inicio_curso(Date fecha_inicio_curso) {
        this.fecha_inicio_curso = fecha_inicio_curso;
    }

    public Date getFecha_fin_curso() {
        return fecha_fin_curso;
    }

    public void setFecha_fin_curso(Date fecha_fin_curso) {
        this.fecha_fin_curso = fecha_fin_curso;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }

    public Curso() {

    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_curso() {
        return id_curso;
    }
}
