package com.exe.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exe.app.entity.Persona;
import com.exe.app.services.PersonaService;

@RestController
@RequestMapping("Personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;
    
     @GetMapping
     public List<Persona> getAll(){
        return personaService.getPersona();
     }

}

