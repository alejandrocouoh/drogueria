/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.seccion.drogueria.repositorio;

import com.example.seccion.drogueria.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    
}
