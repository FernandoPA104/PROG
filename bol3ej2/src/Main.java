import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short primernumero;
        short segundonumero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: " );
        primernumero = sc.nextShort();
        System.out.println("Introduce el segundo numero: " );
        segundonumero = sc.nextShort();
        int resta = primernumero - segundonumero;
        int suma = primernumero + segundonumero;
        if (primernumero >= segundonumero) {
            System.out.println("El primer numero es mayor que el segundo asique se restaran: " + resta );
        } else {
            System.out.println("El primer numero no es mayor que el segundo asique se sumaran: " + suma );
        }


    }
}