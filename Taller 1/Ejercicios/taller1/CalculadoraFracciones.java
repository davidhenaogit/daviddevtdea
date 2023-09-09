package taller1;

import java.util.Scanner;

public class CalculadoraFracciones {

    public static void main(String[] args) {

        double numerador1, numerador2, denominador1, denominador2, resultadoa, resultadob, resultadoc, resultado = 0;
        char operador;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese Primer NUMERADOR  : ");
            numerador1 = teclado.nextDouble();

            System.out.println("Ingrese Primer DENOMINADOR : ");
            denominador1 = teclado.nextDouble();

            System.out.println("Ingrese Segundo NUMERADOR : ");
            numerador2 = teclado.nextDouble();

            System.out.println("Ingrese Segundo DENOMINADOR : ");
            denominador2 = teclado.nextDouble();

            System.out.println("Seleccione operador a usar : *, +, -, /");
            operador = teclado.next().charAt(0);

            if (operador == '+') {
                resultadoa = numerador1 * denominador2;
                resultadob = denominador1 * numerador2;
                resultadoc = denominador1 * denominador2;
                resultado = resultadoa + resultadob;
                resultado = resultado / resultadoc;

            } else if (operador == '-') {
                resultadoa = numerador1 * denominador2;
                resultadob = denominador1 * numerador2;
                resultadoc = denominador1 * denominador2;
                resultado = resultadoa - resultadob;
                resultado = resultado / resultadoc;

            } else if (operador == '*') {
                resultadoa = numerador1 * numerador2;
                resultadob = denominador1 * denominador2;

                resultado = resultadoa / resultadob;

            } else if (operador == '/') {
                if (numerador2 == 0 || denominador2 ==0){
                    System.out.println("=======NO SE PUEDE DIVIDIR POR 0============= ");
                } else {
                    resultadoa = numerador1 * denominador2;
                    resultadob = denominador1 * numerador2;

                    resultado = resultadoa / resultadob;

                }

            } else {
                System.out.println("ERROR EN OPERADOR INGRESADO");
            }

            System.out.println("El resultado con operador " + operador + " es : " + resultado);

        } while (operador != 0);

    }

}
