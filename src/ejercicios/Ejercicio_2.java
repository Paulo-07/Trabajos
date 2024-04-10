package ejercicios;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*
        Implementar un programa en Java que permita convertir 
        dólares a soles (tipo de cambio: 3.48)
        */
        Scanner lector = new Scanner(System.in);
        double dolar, soles;
        System.out.print("Ingresar dolares: ");
        dolar = lector.nextDouble();
        
        soles = dolar * 3.48;
        
        System.out.println("\nConversion a soles es -> S/"+ soles);
        
    }
}
