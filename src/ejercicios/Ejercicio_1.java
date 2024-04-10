package ejercicios;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*
        Escribir un programa que convierta grados Centígrados en grados 
        Fahrenheit. Fórmula: F = (C * 9/5) + 32
        */
        Scanner lector = new Scanner(System.in);
        double c, f;
        System.out.print("Ingresar grados centigrados: ");
        c = lector.nextDouble();
        
        f = (c*(9/5))+32;
        
        System.out.println("\nEn grados Fahrenheit es -> "+ f); 
    }
}
