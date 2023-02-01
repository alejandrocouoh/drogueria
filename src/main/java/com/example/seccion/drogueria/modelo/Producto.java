/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.seccion.drogueria.modelo;

import java.util.Calendar;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    @Column (name = "nombre", nullable = false, length = 150)
    private String nombre;
    @Column (name = "laboratorio", nullable = false, length = 150)
    private String laboratorio;
    @Column (name = "elaboracion", nullable = false)
    private Calendar elaboracion;
    @Column (name = "cauducidad", nullable = false)
    private Calendar caducidad;
    @Column (name = "stock", nullable = false)
    private Integer stock;
    @Column (name = "precio", nullable = false)
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, String laboratorio, Calendar elaboracion, Calendar caducidad, Integer stock, double precio) {
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.elaboracion = elaboracion;
        this.caducidad = caducidad;
        this.stock = stock;
        this.precio = precio;
    }

    public Producto(Integer id_producto, String nombre, String laboratorio, Calendar elaboracion, Calendar caducidad, Integer stock, double precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        this.elaboracion = elaboracion;
        this.caducidad = caducidad;
        this.stock = stock;
        this.precio = precio;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Calendar getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(Calendar elaboracion) {
        this.elaboracion = elaboracion;
    }

    public Calendar getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Calendar caducidad) {
        this.caducidad = caducidad;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
