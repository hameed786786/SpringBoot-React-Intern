package com.example.springbootfirst.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/")
                .allowedOrigins(
                        "http://localhost:5173",
                        "https://springboot-react-intern.onrender.com"
                )
                .allowedMethods("*")
                .allowCredentials(true);
    }
}