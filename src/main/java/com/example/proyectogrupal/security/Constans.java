package com.example.proyectogrupal.security;

import java.nio.charset.StandardCharsets;
import java.security.Key;
public class Constans {

    // Spring Security
    // Endpoint o ruta para loguearse
    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZACION_KEY = "token";

    //Prefijo que tendrá el token JWT
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // Usuario y contraseña de la app
    public static final String USER = "USER";
    public static final String PASS = "1234";

    // JWT
    // Clase que se utilizará para crear el JWT
    public static final String SUPER_SECRET_KEY = "ZnJhc2VzbGFyZ2FzcGFyYWNvbG9jYXJjb21vY2xhdmVlbnVucHJvamVjdG9kZWVtZXBsb3BhcmFqd3Rjb25zcHJpbmdzZWN1cml0eQ==bWlwcnVlYmFkZWVqbXBsb3BhcmFiYXNlNjQ=";

    // Tiempo que sera valido el token
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

    public static Key getSigningKey(String secret) {
        byte[] keyBytes = secret.getBytes(StandardCharsets.UTF_8);
        return Key.hmacShaKeyFor(keyBytes);
    }
}
