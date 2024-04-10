package ejercicios;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        /*
        Escribir un programa que calcule el área de una figura geométrica cualquiera.
        */
        Scanner lector = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Calculo del area de un rectangulo");
        System.out.println("---------------------------------");
        System.out.print("Ingresar base:");
        base = lector.nextDouble();
        System.out.println("Ingresar altura:");
        altura = lector.nextDouble();
        
        // Formula del area de un rectangulo -> A = b * h
        area = base * altura;
        
        System.out.println("\nEl area es -> "+ area);
    }
}
