/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labunoalgoritmos;

import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author glory
 */
public class EjerciciosTest {

    public EjerciciosTest() {
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
     * Test of par method, of class Recursividad.
     */
    @Test
    public void testPar() {
        Ejercicios instance = new Ejercicios();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para determina si es par"));
        if(instance.par(numero))
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
        else
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es par");
    }
    /**
     * Test of esPalindromo method, of class Recursividad.
     */
    @Test
    public void testEsPalindromo() {

        Ejercicios instance = new Ejercicios();
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra para saber si es palíndroma");
        if (palabra.length() == 1) {
            JOptionPane.showMessageDialog(null, "La palabra: " + palabra + " no es palíndroma");
        }else if (instance.esPalindromo(palabra) == true) {
            JOptionPane.showMessageDialog(null, "La palabra: " + palabra + " si es palíndroma");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra: " + palabra + " no es palíndroma");
        }
    }

    /**
     * Test of factorialIterativo method, of class Recursividad.
     */
    @Test
    public void testFactorialIterativo() {
        Ejercicios instance = new Ejercicios();
        JOptionPane.showMessageDialog(null, "Factorial Iterativo de un numero \n Con el número: 7 \n"
                + " El resultado es: " +instance.factorialIterativo(7));
        JOptionPane.showMessageDialog(null, "Factorial Iterativo de un numero \n Con el número: 5 \n"
                + " El resultado es: "+instance.factorialIterativo(5));

    }

    /**
     * Test of factorialRecursivo method, of class Recursividad.
     */
    @Test
    public void testFactorialRecursivo() {
        
        Ejercicios instance = new Ejercicios();
         JOptionPane.showMessageDialog(null, "Factorial Recursivo de un numero \n Con el número: 7 \n"
                 + " El resultado es: " +instance.factorialRecursivo(7));
        JOptionPane.showMessageDialog(null, "Factorial Recursivo de un numero \n Con el número: 5 \n"
                +" El resultado es: "+instance.factorialRecursivo(5));
    }
    
}
