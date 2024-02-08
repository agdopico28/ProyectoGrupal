package com.example.proyectogrupal.security;

import com.example.proyectogrupal.entity.UserAdmin;
import com.example.proyectogrupal.repositories.UserAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserAdminRepository userAdminRepository;

    @Autowired
    public AuthenticationService(UserAdminRepository userAdminRepository) {
        this.userAdminRepository = userAdminRepository;
    }

    public boolean authenticate(String username, String password) {
        // Buscar al usuario administrador por nombre de usuario
        UserAdmin userAdmin = userAdminRepository.findByNameUserAdmin(username);

        // Verificar si se encontró un usuario administrador con el nombre de usuario proporcionado
        if (userAdmin != null) {
            // Comparar la contraseña proporcionada con la contraseña almacenada en la base de datos
            return password.equals(userAdmin.getContraseña());
        }
        return false; // No se encontró un usuario administrador con el nombre de usuario proporcionado
    }
}
