package com.diegoddev.mangashop.gestion_mangas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers("/mangas-api/*","/users-api/*").permitAll()  // Permite todas las solicitudes para esta ruta
                .anyRequest().authenticated()  // El resto de las solicitudes deben estar autenticadas
                .and()
                .csrf().disable();  // Desactiva CSRF si es necesario
        return http.build();
    }
}
