package com.exe.app.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name = "ventas")
public class Venta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private long id_venta;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "forma_pago")
    private String formaPago;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_cliente")
    private String Cliente;

    
    public Venta(long id_Venta, Date fecha, BigDecimal total, String formaPago, String estado, String cliente ) {
        this.id_venta = id_Venta;
        this.fecha = fecha;
        this.total = total;
        this.formaPago = formaPago;
        this.estado = estado;
        this.Cliente = cliente;
    
    }
    
    public long getId_venta() {
        return this.id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getFormaPago() {
        return this.formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return this.Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public Venta() {
    }
    
}

