package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "horarios")
public class Horarios implements Serializable {
    @Id
    @Column(name = "id_horario")
    private Long idHorario;

    @ManyToOne
    @JoinColumn(name = "id_clase", referencedColumnName = "id_clase")
    private Clase clase;

    @Column(name = "hora_inicio")
    private Date horaInicio;
    @Column(name = "hora_fin")
    private Date horaFin;

    @Column(name = "dia_semana")
    private String diaSemana;

    public Horarios(Long idHorario, Clase clase, Date horaInicio, Date horaFin, String diaSemana) {
        this.idHorario = idHorario;
        this.clase = clase;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.diaSemana = diaSemana;
    }

    public Horarios() {
    }

    public Long getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Long id_horario) {
        this.idHorario = id_horario;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date hora_inicio) {
        this.horaInicio = hora_inicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date hora_fin) {
        this.horaFin = hora_fin;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String dia_semana) {
        this.diaSemana = dia_semana;
    }
}
