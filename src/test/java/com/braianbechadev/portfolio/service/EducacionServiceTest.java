/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.braianbechadev.portfolio.service;

import com.braianbechadev.portfolio.model.Educacion;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author braia
 */
public class EducacionServiceTest {
    
    public EducacionServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of verEducacion method, of class EducacionService.
     */
    @Test
    public void testVerEducacion() {
        System.out.println("verEducacion");
        EducacionService instance = new EducacionService();
        List<Educacion> expResult = null;
        List<Educacion> result = instance.verEducacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearEducacion method, of class EducacionService.
     */
    @Test
    public void testCrearEducacion() {
        System.out.println("crearEducacion");
        Educacion per = null;
        EducacionService instance = new EducacionService();
        instance.crearEducacion(per);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarEducacion method, of class EducacionService.
     */
    @Test
    public void testBorrarEducacion() {
        System.out.println("borrarEducacion");
        Long id = null;
        EducacionService instance = new EducacionService();
        instance.borrarEducacion(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarEducacion method, of class EducacionService.
     */
    @Test
    public void testBuscarEducacion() {
        System.out.println("buscarEducacion");
        Long id = null;
        EducacionService instance = new EducacionService();
        Educacion expResult = null;
        Educacion result = instance.buscarEducacion(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarEducacion method, of class EducacionService.
     */
    @Test
    public void testEditarEducacion() {
        System.out.println("editarEducacion");
        Educacion per = null;
        EducacionService instance = new EducacionService();
        instance.editarEducacion(per);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
