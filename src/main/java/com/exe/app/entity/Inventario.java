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
@Table(name = "inventarios")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private long idInventario;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    public Inventario(long idInventario, Producto producto, int cantidad, Date fechaRegistro) {
        this.idInventario = idInventario;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
    }

    public Inventario() {
    }

    // Getters y Setters
    public long getIdInventario() {
        return this.idInventario;
    }

    public void setIdInventario(long idInventario) {
        this.idInventario = idInventario;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}

