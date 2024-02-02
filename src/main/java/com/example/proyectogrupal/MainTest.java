package com.example.proyectogrupal;

import com.example.proyectogrupal.entity.*;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {

        final UsuarioAdmin joseluis = new UsuarioAdmin(1, "Rayden", "Jose Luis Muriach",
                "joseluis@jose.com", "test1234");
        final UsuarioAdmin amalia = new UsuarioAdmin(2, "agdopico", "Amalia Garcia",
                "amalia@amalia.com", "test1234");
        final UsuarioAdmin alejandro = new UsuarioAdmin(3, "Destroyer", "Alejandro Corro",
                "alejandro@alex.com", "test1234");

        Profesor pedro = new Profesor("1", "Pedro", "PeSeg", 111111111,
                "11111111A", "pedro@pedro.com");
        Curso segundoDAM = new Curso(1L, "Acceso a datos", "Curso de acceso a los datos",
                new Date(01,10,2019), new Date(01,01,2020), true);
        Matricula matriculacion = new Matricula(1L, joseluis, segundoDAM, true);
        Clase nuevaClase = new Clase(1L, pedro, segundoDAM, matriculacion,
                "Acceso a datos", "rojo");
    }
}
