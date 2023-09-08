package taller1;

import java.util.Scanner;

/*
 * Ejercicio 4: Número mágico
Crear un programa que determine si un número ingresado por el usuario es un número "especial". 
Un número es "especial" si cumple con los siguientes criterios:
•	Es divisible entre 5.
•	No es divisible entre 2 ni 3.

 */
public class Magico {
    
    public static void main(String[] args) {
        
        int numero=0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese número para ser evaluado como ESPECIAL : ");
        numero= teclado.nextInt();

        if(numero % 5 ==0 && numero % 2 != 0 && numero % 3 !=0){
            System.out.println("El número "+ numero + " es ESPECIAL !!! porque es divisible por 5 pero no por 2 ni por 3");
        }else{
            System.out.println("Nada, el número : " + numero + " no es especial.");
        }

    }
}
