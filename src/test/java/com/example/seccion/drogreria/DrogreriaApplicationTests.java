package com.example.seccion.drogreria;

import com.example.seccion.drogueria.controlador.ProductoControlador;
import com.example.seccion.drogueria.modelo.Producto;
import com.example.seccion.drogueria.repositorio.ProductoRepositorio;
import com.example.seccion.drogueria.servicio.ProductoServicio;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootTest
//@RunWith(SpringRunner.class)
//@SpringBootTest(
//        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
//        classes = Producto.class)
//@AutoConfigureMockMvc
//@TestPropertySource(
//        locations = "classpath:application-integrationtest.properties")
class DrogreriaApplicationTests {

    public DrogreriaApplicationTests() {
    }

    @Test
    void contextLoads() {
    }

//    @Test
//    public void listarProductosTest() {
//        Assertions.assertNotNull(productoservicio.getAllProductos());
//    }
//    @Test
//    public void guardarProductosTest() {
//        Calendar fecha_elaboracion = new GregorianCalendar(2022, 4, 3);
//        Calendar fecha_caducidad = new GregorianCalendar(2025, 7, 10);
//        Producto guardarProducto = new Producto("Paracetamol", "Allen Laboratorios, S.A. de C.V.", fecha_elaboracion, fecha_caducidad, 22, 30.00);
//        Assertions.assertNotNull(productoservicio.nuevoProducto(guardarProducto));
//    }
}
