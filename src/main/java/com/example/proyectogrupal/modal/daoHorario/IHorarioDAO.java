package com.example.proyectogrupal.modal.daoHorario;

import com.example.proyectogrupal.entity.Horarios;

public interface IHorarioDAO {
    void save(Horarios horarios);

    void update(Horarios horarios);

    void delete(Integer id);

    void findById(Integer id);
}
