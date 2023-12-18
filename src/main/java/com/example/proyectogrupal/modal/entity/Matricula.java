package com.example.proyectogrupal.modal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "matricula")
public class Matricula implements Serializable {
    @Id
    @Column(name = "id_matricula")
    private int id_matricula;

    //Con esto hacemos la refencia
    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    private UsuarioAdmin id_usuario;


    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;


    @Column(name = "estado")
    private boolean estado;

    public Matricula(int id_matricula, UsuarioAdmin id_usuario, Curso curso, boolean estado) {
        this.id_matricula = id_matricula;
        this.id_usuario = id_usuario;
        this.curso = curso;
        this.estado = estado;
    }

    public Matricula() {

    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public UsuarioAdmin getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(UsuarioAdmin id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
