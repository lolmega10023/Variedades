package com.exe.app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


    @Entity
    @Table(name = "Persona")
    public class Persona {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idPersona;
    
        @Column(name = "nombre")
        private String nombre;
        @Column(name = "apellido")
        private String apellido;
        @Column(name = "direccion")
        private String direccion;
        @Column(name = "telefono")  
        private String telefono;
        @Column(name = "email")
        private String email;
        @Column(name = "fechaRegistro")
        private Date fechaRegistro;
        @Column(name = "ultimaCompra")
        private Date ultimaCompra;

        @ManyToOne
        @JoinColumn(name = "idRol")
        private Rol rol;
    

    public Persona(long idPersona, String nombre, String apellido, String direccion, String telefono, String email, Date fechaRegistro, Date ultimaCompra, Rol rol) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.ultimaCompra = ultimaCompra;
        this.rol = rol;
    }


        public Persona() {
        }
     

    public long getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getUltimaCompra() {
        return this.ultimaCompra;
    }

    public void setUltimaCompra(Date ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

        
    }
    