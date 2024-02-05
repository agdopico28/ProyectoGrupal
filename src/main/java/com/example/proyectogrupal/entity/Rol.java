package com.example.proyectogrupal.entity;

public enum Rol {
    ADMIN("ADMIN"),
    USER("USER");
    private final String rol;

    Rol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
}
