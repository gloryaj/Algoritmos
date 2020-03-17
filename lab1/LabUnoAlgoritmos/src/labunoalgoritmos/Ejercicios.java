package labunoalgoritmos;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author glory
 */
public class Ejercicios {

    // a. Crear un algoritmo recursivo para determinar si un numero es par utilizando recursividad indirecta.
    public boolean impar(int numero) {
        if (numero == 0) {
            return false;
        } else {
            return par(numero - 1);
        }
    }

    public boolean par(int num) {
        if (num == 0) {
            return true;
        } else {
            return impar(num - 1);
        }
    }

    //b. Crear un algoritmo recursivo que reciba un string e indique si conforma una palabra palíndroma, 
    public boolean esPalindromo(String palabra) {

        if (palabra.length() <= 1) {
            return true;
        } else {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
                return esPalindromo(palabra.substring(1, palabra.length() - 1));
            } else {
                return false;
            }
        }
    }

    //c. Crear un algoritmo iterativo que retorne el factorial de un número dado. Además crear una solución recursiva
    //factorial de un num
    public double factorialIterativo(int n) {
        double fact = 1;
        int i;
        if (n == 0) {
            fact = 1;
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

// Método recursivo factorial
    public double factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (factorialRecursivo(n - 1));
        }
    }

    //d. Crear un método recursivo que reciba un arreglo de números enteros y lo ordene de forma descendente y retorne el arreglo ordenado.
    // public static int[] arr = {5, 2, 4, 8, 3};
    public String ordenar(int[] arr) {
        int menor = 0;
        String resultado = "";

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > menor) {
                menor = arr[i];
                System.out.println(menor);
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[i] > menor) {
                        menor = arr[i];
                        System.out.println(menor);
                        return arr[i] + ordenar(arr);
                    }else
                        return resultado+=menor;
                }
            }
        }
        return resultado;
    }

    public String repeat1(char c, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += c;
        }
        return answer;
    }

    public String repeat2(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    //determina si num es impar
    public boolean unknown(int num) {
        int contador = 2; //6
        boolean result = true; //6
        while ((result) && (contador != num)) { //x
            if (num % contador == 0) { //6
                result = false;//6
            }
            contador++;//6
        }
        return result;//6
    }

//  6+6+x(6+6+6)+6
//    12 +x(18)+6
//    12+18x+6
//    18+18x
//    x => Big-O
    //suma las dos posiciones anteriores segun el numero ingresado
    public int unknown(int n, int arr[]) {
        for (int i = 0; i < n; i++) { //x
            if (i < 2) { //y
                arr[i] = 1;//3
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];//3
            }
        } //for
        return arr[n - 1];//3
    }

//    x(y(3)+3)+3
//	x(3y+3)+3
//	3yx+3x+3
}
