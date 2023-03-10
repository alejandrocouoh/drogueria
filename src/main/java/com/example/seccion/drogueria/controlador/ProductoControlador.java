/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.seccion.drogueria.controlador;

import com.example.seccion.drogueria.modelo.Producto;
import com.example.seccion.drogueria.servicio.ProductoServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@RestController
@RequestMapping("/v1/")
@CrossOrigin(origins ="http://localhost:4200/")
public class ProductoControlador {
    
    @Autowired
    private final ProductoServicio servicioProducto;

    public ProductoControlador(ProductoServicio servicioProducto) {
        this.servicioProducto = servicioProducto;
    }
    
    @GetMapping("/productos")
    public List<Producto> listarproductos(){
        return servicioProducto.getAllProductos();
    }
    
    @GetMapping("/productos/{id}")
    public Optional<Producto> obtenerProductoId(@PathVariable Integer id){
        return servicioProducto.getProductoById(id);
    }
    
    @PostMapping("/productos")
    public Producto agregarproducto(@RequestBody Producto producto){
        return servicioProducto.nuevoProducto(producto);
//        return new ResponseEntity<Producto>(servicioProducto.nuevoProducto(producto),HttpStatus.OK);
    }
    
    @PutMapping("/modificarProduto/{id}")
    public Producto modificarProducto(@PathVariable Integer id, @RequestBody Producto producto){
        return servicioProducto.editarProducto(id,producto);
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Integer id){
         servicioProducto.eliminarProducto(id);
    }
}

