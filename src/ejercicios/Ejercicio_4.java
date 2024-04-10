package ejercicios;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        /*
        Escribir un programa que resuelva una fórmula matemática que utilice 
        al menos 3 variables.
        */
        Scanner lector = new Scanner(System.in);
        double a, b , c, resultado;
        System.out.println("Cuadrado de un trinomio");
        System.out.println("-----------------------");
        System.out.println("     (a + b + c)^2     ");
        System.out.print("Ingresar a: ");
        a = lector.nextDouble();
        System.out.print("Ingresar b: ");
        b = lector.nextDouble();
        System.out.print("Ingresar c: ");
        c = lector.nextDouble();
        
        resultado = Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)
                + (2*(a*b)) + (2*(a*c)) + (2*(b*c));
        
        System.out.printf("%nResultado es -> %.2f",resultado );
    }
}
