package taller1;

import java.util.Scanner;

/*
 * Ejercicio 1: Calculadora de Fracciones.
Crear una calculadora que maneje fracciones. 
El usuario ingresará dos fracciones y un operador. 
La calculadora deberá realizar la operación. 
Debes manejar sumas, restas, multiplicaciones y divisiones. 
Si el usuario intenta dividir entre cero, deberás mostrar un mensaje de error.

 */
public class Calculadora {

    public static void main(String[] args) {

        double n1, n2, resultado = 0;
        char operador = '+';

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese Primer valor numérico : ");
            n1 = teclado.nextDouble();

            System.out.println("Ingrese Segundo valor numérico : ");
            n2 = teclado.nextDouble();

            System.out.println("Seleccione operador a usar : *, +, -, /");
            operador = teclado.next().charAt(0);
            // se le aplica a String -- operador = (char)System.in.read();
            // se le aplica a char --- operador = teclado.next().charAt(0);
            if (operador == '+') {
                resultado = n1 + n2;
            } else if (operador == '-') {
                resultado = n1 - n2;
            } else if (operador == '*') {
                resultado = n1 * n2;
            } else if (operador == '/') {
                if (n2 == 0) {
                    System.out.println("=======NO SE PUEDE DIVIDIR POR 0============= ");
                } else {
                    resultado = n1 / n2;
                }

            } else {
                System.out.println("ERROR EN OPERADOR INGRESADO");
            }

            System.out.println("El primer número es: " + n1 + " , El segundo número es: " + n2 + "  y su  " + operador
                    + " es :" + resultado);

        } while (operador != 0);
    }

}
