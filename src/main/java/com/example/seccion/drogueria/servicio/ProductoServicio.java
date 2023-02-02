/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.seccion.drogueria.servicio;

import com.example.seccion.drogueria.modelo.Producto;
import com.example.seccion.drogueria.repositorio.ProductoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Service
public class ProductoServicio {
    
    @Autowired
    private final ProductoRepositorio repositorioProducto;

    public ProductoServicio(ProductoRepositorio repositorioProducto) {
        this.repositorioProducto = repositorioProducto;
    }
    
    public List<Producto> getAllProductos(){
        return  repositorioProducto.findAll();
    }
    
    public Optional<Producto> getProductoById(Integer id){
        return repositorioProducto.findById(id);
    }
    
    public Producto nuevoProducto(Producto producto){
        return repositorioProducto.save(producto);
    }
    
    public Producto editarProducto(Integer id, Producto producto){
        Producto productomodificado = repositorioProducto.findById(id).orElseThrow();
        productomodificado.setNombre(producto.getNombre());
        productomodificado.setLaboratorio(producto.getLaboratorio());
        productomodificado.setElaboracion(producto.getElaboracion());
        productomodificado.setCaducidad(producto.getCaducidad());
        productomodificado.setStock(producto.getStock());
        productomodificado.setPrecio(producto.getPrecio());
        return repositorioProducto.save(productomodificado);
    }
    
    public void eliminarProducto(Integer id){
        repositorioProducto.deleteById(id);
    }

    public Producto editarProducto(Optional<Producto> productomodificado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
