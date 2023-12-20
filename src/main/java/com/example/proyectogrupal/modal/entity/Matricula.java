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
    @JoinColumn(name = "id_usuario_admin", referencedColumnName = "id_usuario_admin")
    private UsuarioAdmin id_usuario_admin;


    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;


    @Column(name = "estado")
    private boolean estado;

    public Matricula(int id_matricula, UsuarioAdmin id_usuario_admin, Curso curso, boolean estado) {
        this.id_matricula = id_matricula;
        this.id_usuario_admin = id_usuario_admin;
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
        return id_usuario_admin;
    }

    public void setId_usuario(UsuarioAdmin id_usuario_admin) {
        this.id_usuario_admin = id_usuario_admin;
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
