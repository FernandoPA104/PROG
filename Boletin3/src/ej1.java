import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero : ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");

        }
        else if (numero < 0) {
            System.out.println("El numero es negativo");
        }
    }
}
