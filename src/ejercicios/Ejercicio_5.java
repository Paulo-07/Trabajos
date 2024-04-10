package ejercicios;
import java.util.Scanner;


public class Ejercicio_5 {
    public static void main(String[] args) {
        /*
        Escribir un programa que, dado un monto total, lo descomponga en 
        monto a pagar e IGV (18%)
        */
        Scanner lector = new Scanner(System.in);
        double mont_total, mont_pagar, IGV;
        System.out.print("Ingresar monto total: ");
        mont_total = lector.nextDouble();
        
        IGV = mont_total * 0.18;
        mont_pagar = mont_total - IGV;
        
        System.out.printf("%nMonto a pagar es -> %.1f%n", mont_pagar);
        System.out.printf("IGV es -> %.1f%n", IGV);
    }
}
