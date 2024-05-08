/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class CalculandoTest {
     
    public CalculandoTest() {
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
     * Test of add method, of class Calculando.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double number1 = 2;
        double number2 = 2;
        Calculando instance = new Calculando();
        double expResult = 4;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of subtract method, of class Calculando.
     */
    @Test
    public void testSubtract() {
      
    }

    /**
     * Test of multiply method, of class Calculando.
     */
    @Test
    public void testMultiply() {
       
    }

    /**
     * Test of divide method, of class Calculando.
     */
    @Test//(expResult=ArithmeticException.class)
    public void testDivide() {
        System.out.println("divide");
        double number1 = 10;
        double number2 = 0.0;
        Calculando instance = new Calculando();
        double expResult = 0.0;
        try{
            double result = instance.divide(number1, number2);
            assertEquals(0, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
            fail("Fallo, Deber?a haber lanzado una excepci?n");
        }catch(Exception e){
            System.out.println("Capturo divide by cero-> "+e.getMessage());
           // fail("Fallo, Deber?a haber lanzado una excepci?n"+e.getMessage());
        }
    }
    
}
