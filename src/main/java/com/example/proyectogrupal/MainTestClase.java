package com.example.proyectogrupal;

import com.example.proyectogrupal.entity.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

public class MainTestClase {
    private static String baseURL = "http://localhost:8080/clases"; //Hay que cambiarlo por 172.17.0.2
    public static void main(String[] args) {

        final UserAdmin joseluis = new UserAdmin(1L, "Rayden", "Jose Luis Muriach",
                "joseluis@jose.com", "test1234");
        final UserAdmin amalia = new UserAdmin(2L, "agdopico", "Amalia Garcia",
                "amalia@amalia.com", "test1234");
        final UserAdmin alejandro = new UserAdmin(3L, "Destroyer", "Alejandro Corro",
                "alejandro@alex.com", "test1234");

        Teacher pedro = new Teacher(1L, "Pedro", "PeSeg", 111111111,
                "11111111A", "pedro@pedro.com");
        Course segundoDAM = new Course(1L, "Acceso a datos", "Curso de acceso a los datos",
                new Date(01,10,2019), new Date(01,01,2020), true);
        Enrollment matriculacion = new Enrollment(1L, joseluis, segundoDAM, true);

        Clase nuevaClase = new Clase(1L, pedro, segundoDAM, matriculacion,
                "Acceso a datos", "rojo");

        MainTestClase test = new MainTestClase();
        test.makeTest(nuevaClase);
    }

    public void makeTest(Clase newClase) { //Add a new clase
        newClase = addClase(newClase);
        System.out.println("Class added: " + newClase);

        //List all clases
        claseList();
    }

    private Clase addClase(Clase clase) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Clase> response = restTemplate.postForEntity(baseURL, clase, Clase.class);
        return response.getBody();
    }

    private void claseList() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Clase[]> response = restTemplate.getForEntity(baseURL, Clase[].class);
        Clase[] clases = response.getBody();
        System.out.println("Lista de contactos:");
        for (Clase clase : clases) {
            System.out.println(clase);
        }
    }
}
