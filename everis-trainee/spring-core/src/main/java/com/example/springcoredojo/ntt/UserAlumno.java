package com.example.springcoredojo.ntt;

import org.springframework.stereotype.Component;

@Component
public class UserAlumno {

    public Alumno getUsuarioAlumno(){

        return new Alumno("Miguel","Cisneros",27);
    }
}
