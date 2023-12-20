package com.example.proyectogrupal.modal.daoClase;

import com.example.proyectogrupal.modal.entity.Clase;

public interface IClaseDAO {
    void save(Clase clase);

    void update(Clase clase);

    void delete(Integer id);

    void findById(Integer id);
}
