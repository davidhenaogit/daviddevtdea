package taller1;

import java.util.Scanner;

/*
 * Ejercicio 2: Farenheit a Celcius.
Crear un sistema que solicite al usuario una temperatura en grados Farenheit 
e imprima como resultado su conversión a grados Celcius. 
Para ello, usar la siguiente fórmula: ºC = (ºF-32) ÷ 1.8

 */
public class Temperatura {
    

    public static void main(String[] args) {
        double farenheit=0.0;
        double celcius;


        Scanner teclado = new Scanner(System.in);

        System.out.println("====== CONVERSOR DE GRADOS FARENHEIT A CELCIUS ======");
        System.out.println("Ingrese gadros farenheit: ");
        farenheit= teclado.nextDouble();

        celcius= (farenheit - 32) / 1.8;
        System.out.println(farenheit + " Grados Farenheit equivalen a: " + celcius + " grados Celcius");

    }
}
