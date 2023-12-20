package com.example.proyectogrupal.modal.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "horarios")
public class Horarios implements Serializable {
    @Id
    @Column(name = "id_horario")
    private int id_horario;

    @ManyToOne
    @JoinColumn(name = "id_clase", referencedColumnName = "id_clase")
    private Clase clase;

    @Column(name = "hora_inicio")
    private Date hora_inicio;
    @Column(name = "hora_fin")
    private Date hora_fin;

    @Column(name = "dia_semana")
    private String dia_semana;

    public Horarios(int id_horario, Clase clase, Date hora_inicio, Date hora_fin, String dia_semana) {
        this.id_horario = id_horario;
        this.clase = clase;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.dia_semana = dia_semana;
    }

    public Horarios() {
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Date hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }
}
