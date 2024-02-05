package com.example.proyectogrupal.modal.estudianteDAO;

import com.example.proyectogrupal.entity.Estudent;

public interface EstudianteDAO {

    void save (Estudent estudent);

    void update(Estudent estudent);

    void delete(Estudent estudent);

    void findById(Integer id);

}
