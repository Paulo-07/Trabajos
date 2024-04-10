package ejercicios;
import java.util.Scanner;


public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /*
        Escribe un programa que solicite al usuario su nombre y luego imprima 
        un saludo personalizado. Por ejemplo, si el usuario introduce "Juan", 
        el programa debe imprimir "¡Hola Juan!".
        */
        String nombre;
        System.out.print("Ingresar nombre: ");
        nombre = lector.next();
        
        System.out.printf("%nHola %S!%n", nombre);
        
    }
}
