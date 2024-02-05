package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "matricula")
public class Enrollment implements Serializable {
    @Id
    @Column(name = "id_matricula")
    private Long idEnrollment;

    //Con esto hacemos la refencia
    @OneToOne
    @JoinColumn(name = "id_usuario_admin", referencedColumnName = "id_usuario_admin")
    private UserAdmin idUserAdmin;


    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Course course;


    @Column(name = "estado")
    private boolean state;

    public Enrollment(Long idEnrollment, UserAdmin idUserAdmin, Course course, boolean state) {
        this.idEnrollment = idEnrollment;
        this.idUserAdmin = idUserAdmin;
        this.course = course;
        this.state = state;
    }

    public Enrollment() {

    }

    public Long getIdEnrollment() {
        return idEnrollment;
    }

    public void setIdEnrollment(Long idMatricula) {
        this.idEnrollment = idMatricula;
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean estado) {
        this.state = estado;
    }
}
