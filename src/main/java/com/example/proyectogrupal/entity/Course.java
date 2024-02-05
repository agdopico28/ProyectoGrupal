package com.example.proyectogrupal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="curso")
public class Course implements Serializable {

    @Id
    @Column(name="id_curso")
    private Long idCurso;

    @Column(name="nombre_curso")
    private String nombreCurso;

    @Column(name="descripcion_curso")
    private String descripcionCurso;

    @Column(name="fecha_inicio_curso")
    private Date fechaInicioCurso;

    @Column(name="fecha_fin_curso")
    private Date fechaFinCurso;

    @Column(name="habilitar")
    private boolean habilitar;

    public Course(Long idCurso, String nombreCurso, String descripcionCurso, Date fechaInicioCurso, Date fechaFinCurso,
                  boolean habilitar) {

        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.fechaInicioCurso = fechaInicioCurso;
        this.fechaFinCurso = fechaFinCurso;
        this.habilitar = habilitar;
    }

    public Course() {
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public Date getFechaInicioCurso() {
        return fechaInicioCurso;
    }

    public void setFechaInicioCurso(Date fechaInicioCurso) {
        this.fechaInicioCurso = fechaInicioCurso;
    }

    public Date getFechaFinCurso() {
        return fechaFinCurso;
    }

    public void setFechaFinCurso(Date fechaFinCurso) {
        this.fechaFinCurso = fechaFinCurso;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }
}
