package com.exe.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exe.app.entity.Persona;

@Repository("PersonaRepository")
public interface PersonaRepository extends JpaRepository<Persona, Long>{
}

