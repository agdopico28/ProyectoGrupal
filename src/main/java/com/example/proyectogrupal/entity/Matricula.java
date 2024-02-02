package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "matricula")
public class Matricula implements Serializable {
    @Id
    @Column(name = "id_matricula")
    private Long idMatricula;

    //Con esto hacemos la refencia
    @OneToOne
    @JoinColumn(name = "id_usuario_admin", referencedColumnName = "id_usuario_admin")
    private UsuarioAdmin idUsuarioAdmin;


    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Curso curso;


    @Column(name = "estado")
    private boolean estado;

    public Matricula(Long idMatricula, UsuarioAdmin idUsuarioAdmin, Curso curso, boolean estado) {
        this.idMatricula = idMatricula;
        this.idUsuarioAdmin = idUsuarioAdmin;
        this.curso = curso;
        this.estado = estado;
    }

    public Matricula() {

    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public UsuarioAdmin getIdUsuario() {
        return idUsuarioAdmin;
    }

    public void setIdUsuario(UsuarioAdmin idUsuarioAdmin) {
        this.idUsuarioAdmin = idUsuarioAdmin;
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
