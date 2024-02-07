package com.example.proyectogrupal.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "clase", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id_profesor", "id_curso", "id_matricula"})
})
public class Clase implements Serializable {
    @Id
    @Column(name = "id_clase")
    private Long idClase;

    @ManyToOne
    @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "id_matricula", referencedColumnName = "id_matricula")
    private Enrollment enrollment;

    @Column(name = "nombre_clase")
    private String nombreClase;

    @Column(name = "color")
    private String color;

    public Clase() {
    }

    public Clase(Long idClase, Teacher teacher, Course course, Enrollment enrollment, String nombreClase, String color) {
        this.idClase = idClase;
        this.teacher = teacher;
        this.course = course;
        this.enrollment = enrollment;
        this.nombreClase = nombreClase;
        this.color = color;
    }

    public Long getIdClase() {
        return idClase;
    }

    public void setIdClase(Long idClase) {
        this.idClase = idClase;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
