/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example.seccion.drogueria.modelo;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro Couoh Haas <your.name at your.org>
 */
public class ProductoTest {
    
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId_producto method, of class Producto.
     */
    @Test
    public void testGetId_producto() {
        System.out.println("getId_producto");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getId_producto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_producto method, of class Producto.
     */
    @Test
    public void testSetId_producto() {
        System.out.println("setId_producto");
        Integer id_producto = null;
        Producto instance = new Producto();
        instance.setId_producto(id_producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaboratorio method, of class Producto.
     */
    @Test
    public void testGetLaboratorio() {
        System.out.println("getLaboratorio");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getLaboratorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLaboratorio method, of class Producto.
     */
    @Test
    public void testSetLaboratorio() {
        System.out.println("setLaboratorio");
        String laboratorio = "";
        Producto instance = new Producto();
        instance.setLaboratorio(laboratorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getElaboracion method, of class Producto.
     */
    @Test
    public void testGetElaboracion() {
        System.out.println("getElaboracion");
        Producto instance = new Producto();
        Calendar expResult = null;
        Calendar result = instance.getElaboracion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setElaboracion method, of class Producto.
     */
    @Test
    public void testSetElaboracion() {
        System.out.println("setElaboracion");
        Calendar elaboracion = null;
        Producto instance = new Producto();
        instance.setElaboracion(elaboracion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCaducidad method, of class Producto.
     */
    @Test
    public void testGetCaducidad() {
        System.out.println("getCaducidad");
        Producto instance = new Producto();
        Calendar expResult = null;
        Calendar result = instance.getCaducidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCaducidad method, of class Producto.
     */
    @Test
    public void testSetCaducidad() {
        System.out.println("setCaducidad");
        Calendar caducidad = null;
        Producto instance = new Producto();
        instance.setCaducidad(caducidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class Producto.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStock method, of class Producto.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        Integer stock = null;
        Producto instance = new Producto();
        instance.setStock(stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        Producto instance = new Producto();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
