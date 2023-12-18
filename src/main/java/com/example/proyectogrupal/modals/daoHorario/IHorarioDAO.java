package com.example.proyectogrupal.modals.daoHorario;

import com.example.proyectogrupal.modals.entity.Clase;
import com.example.proyectogrupal.modals.entity.Horarios;

public interface IHorarioDAO {
    void save(Horarios horarios);

    void update(Horarios horarios);

    void delete(Integer id);

    void findById(Integer id);
}
