/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.sweet.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author castr
 */
public class OperacionTest {
    
    public OperacionTest() {
    }

  

    /**
     * Test of obtenerNumeroMayor method, of class Operacion.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerNumeroMayor() {
        System.out.println("obtenerNumeroMayor");
        int[] numeros = {4,78,2,90,156,34,81,16,9,24};
        Operacion instance = new Operacion();
        int expResult = 156;
        int result = instance.obtenerNumeroMayor(numeros);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obtenerPromedio method, of class Operacion.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerPromedio() {
        System.out.println("obtenerPromedio");
        int[] numeros = null;
        Operacion instance = new Operacion();
        double expResult = 0.0;
        double result = instance.obtenerPromedio(numeros);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumeroMenor method, of class Operacion.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerNumeroMenor() {
        System.out.println("obtenerNumeroMenor");
        int[] numeros = {4,78,2,90,156,34,81,16,9,24};
        Operacion instance = new Operacion();
        int expResult = 2;
        int result = instance.obtenerNumeroMenor(numeros);
        assertEquals(expResult, result);
        
    }
    
}
