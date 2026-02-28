package com.talentotech.energia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //se carga automaticamente al iniciar la aplicación
@EnableMethodSecurity //activa la seguridad a nivel de método, permitiendo usar anotaciones como @PreAuthorize en los controladores
public class SecurityConfig {
    @Bean
    public PasswordEncoder passwordEncoder() { //crea un objeto de codificación de contraseñas utilizando BCrypt, que es un algoritmo de hashing seguro para almacenar contraseñas
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) //desactiva la protección CSRF, lo cual es común en APIs REST donde no se utilizan cookies para la autenticación, si no se activa falla POST/PUT/DELETE
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/users").permitAll()
                .requestMatchers("/api/users/{id}").permitAll()
                .requestMatchers("/api/users/login").permitAll()
                .requestMatchers("api/country").permitAll()
                .requestMatchers("api/region").permitAll()
                .requestMatchers("api/Company").permitAll()
                .anyRequest().authenticated())
                .formLogin(form -> form.disable())
                .httpBasic(basic -> basic.disable());
        return http.build();
            
    }
}
