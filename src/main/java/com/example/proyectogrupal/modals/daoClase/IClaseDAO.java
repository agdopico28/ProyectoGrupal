package com.example.proyectogrupal.modals.daoClase;

import com.example.proyectogrupal.modals.entity.Clase;

public interface IClaseDAO {
    void save(Clase clase);

    void update(Clase clase);

    void delete(Integer id);

    void findById(Integer id);
}
