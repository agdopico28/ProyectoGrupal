package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private final AuthenticationService authenticationService;

    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/loogin")
    public String showLoginForm() {
        return "login";
    }
    @GetMapping("/welcome" )
    public String showWelcomeForm() {
        return "welcome";
    }

    @PostMapping("/loogin")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        boolean isAuthenticated = authenticationService.authenticate(username, password);

        if (isAuthenticated) {
            return "welcome";
        } else {
            // Autenticación fallida, agregar un mensaje de error y redirigir de vuelta al formulario de inicio de sesión
            model.addAttribute("error", "Credenciales inválidas");
            return "login";
        }
    }
}
