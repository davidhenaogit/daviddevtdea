package taller1;

import java.util.Scanner;

/*
 * Ejercicio 3: Calculo de masa corporal.
Crear un sistema que permita calcular el índice de masa corporal de un usuario. 
Usar la siguiente formula peso (kg) / [estatura (m)]2

IMC	Nivel de peso
Por debajo de 18.5	Bajo peso
18.5—24.9	Peso saludable
25.0—29.9	Sobrepeso
30.0 o más	Obesidad

 */
public class Masacorporal {

    public static void main(String[] args) {

        double estatura;
        double peso;
        double imc = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Estatura en metros: ");
        estatura = sc.nextDouble();

        System.out.println("Ingrese Peso en Kgs: ");
        peso = sc.nextDouble();

        imc = peso / (estatura * estatura);

        if (imc <= 18.5) {
            System.out.println("El IMC es : " + imc + " Significa que usted está BAJO DE PESO ! ");
        }else if(imc > 18.5 && imc <= 24.9){
            System.out.println("El IMC es : " + imc + " significa que usted tiene un peso SALUDABLE ! ");

        }else if (imc > 24.9 && imc <= 29.9){
             System.out.println("El IMC es : " + imc + " significa que usted tiene SOBRE PESO ! ");

        }else{
            System.out.println("El IMC es : " + imc + " CUIDADO ERES OBESO, GORDO !!! ");
        }
    }

}
