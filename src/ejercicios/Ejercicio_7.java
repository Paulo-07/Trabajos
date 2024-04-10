package ejercicios;

import java.util.Scanner;


public class Ejercicio_7 {
    public static void main(String[] args) {
        /*
        Crea un programa que solicite al usuario dos números enteros y realice 
        las cuatro operaciones aritméticas básicas (suma, resta, multiplicación 
        y división) con esos números. Imprime los resultados.
        */
        Scanner lector = new Scanner(System.in);
        double n1,n2,sum,rest,multi,div;
        
        System.out.print("Ingresar numero 1: ");
        n1 = lector.nextDouble();
        System.out.print("Ingresar numero 2: ");
        n2 = lector.nextDouble();
        
        sum = n1 + n2;
        rest = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        
        System.out.printf("%nLa suma es -> %.1f%n",sum);
        System.out.printf("La multiplicacion es -> %.1f%n",multi);
        System.out.printf("La resta es -> %.1f%n",rest);
        System.out.printf("La division es -> %.1f%n",div);
    }
}
