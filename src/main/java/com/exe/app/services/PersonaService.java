package com.exe.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exe.app.entity.Persona;
import com.exe.app.repository.PersonaRepository;

    @Service("personaService")
public class PersonaService{

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> getPersona(){
        return personaRepository.findAll();
    }
}
