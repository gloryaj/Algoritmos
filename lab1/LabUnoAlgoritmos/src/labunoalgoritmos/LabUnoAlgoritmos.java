/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labunoalgoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author glory
 */
public class LabUnoAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ejercicios recursividad= new Ejercicios();

       //tiempos de ejecucion
        //analisis del algoritmo 1
        long startTime = System.currentTimeMillis();
        String result = recursividad.repeat1('B', 1000);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;

        System.out.println("Algoritmo: repeat1 \n"
                + "N es igual a 100 \n" 
                + "Resultado: " + result + "\n"
                + "Tn en milisegundos: " + tn + "\n"
        );
        
        //analisis del algoritmo 1
        startTime = System.currentTimeMillis();
        result = recursividad.repeat1('C', 50000);
        endTime = System.currentTimeMillis();
        tn = endTime - startTime;

        System.out.println("Algoritmo: repeat1 \n"
                + "N es igual a 50000 \n" 
                + "Resultado: " + result + "\n"
                + "Tn en milisegundos: " + tn + "\n"
        );
        
        //analisis del algoritmo 2
        startTime = System.currentTimeMillis();
        result = recursividad.repeat2('B', 1000);
        endTime = System.currentTimeMillis();
        tn = endTime - startTime;

        System.out.println("Algoritmo: repeat2 \n"
                + "N es igual a 100 \n" 
                + "Resultado: " + result + "\n"
                + "Tn en milisegundos: " + tn+ "\n"
        );
        
        //analisis del algoritmo 2
        startTime = System.currentTimeMillis();
        result = recursividad.repeat2('C', 50000);
        endTime = System.currentTimeMillis();
        tn = endTime - startTime;

        System.out.println("Algoritmo: repeat2 \n"
                + "N es igual a 50000 \n" 
                + "Resultado: " + result + "\n"
                + "Tn en milisegundos: " + tn + "\n"
        );
    }
    
    
}
