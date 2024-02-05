package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "matricula")
public class Enrollment implements Serializable {
    @Id
    @Column(name = "id_matricula")
    private Long idMatricula;

    //Con esto hacemos la refencia
    @OneToOne
    @JoinColumn(name = "id_usuario_admin", referencedColumnName = "id_usuario_admin")
    private UserAdmin idUserAdmin;


    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Course course;


    @Column(name = "estado")
    private boolean estado;

    public Enrollment(Long idMatricula, UserAdmin idUserAdmin, Course course, boolean estado) {
        this.idMatricula = idMatricula;
        this.idUserAdmin = idUserAdmin;
        this.course = course;
        this.estado = estado;
    }

    public Enrollment() {

    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public UserAdmin getIdUsuario() {
        return idUserAdmin;
    }

    public void setIdUsuario(UserAdmin idUserAdmin) {
        this.idUserAdmin = idUserAdmin;
    }

    public Course getCurso() {
        return course;
    }

    public void setCurso(Course course) {
        this.course = course;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
