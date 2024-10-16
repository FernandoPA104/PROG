import java.util.Scanner;
/**
 * Desglosa en X numero de billetes de cada tipo el importe de Euros introducido
 * @version 1.0
 * @author Fernando Piñeiro
 */
public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad en euros: ");
        int cantidad = sc.nextInt();
        int billetes100 = cantidad / 100;
        cantidad = cantidad % 100;
        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;
        int billetes5 = cantidad / 5;
        cantidad = cantidad % 5;
        int monedas1 = cantidad;
        System.out.println("Desglose: ");
        System.out.println("billetes100 :" + billetes100);
        System.out.println("billetes50: " + billetes20);
        System.out.println("billetes5: " + billetes5);
        System.out.println("monedas1: " + monedas1);

    }
}
