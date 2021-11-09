package com.example.springcoredojo.ntt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Usuario.class)
public class Config {
    @Bean
    public Alumno getUsuario(){

        return new Alumno("Miguel","Cisneros",27);
    }

}
