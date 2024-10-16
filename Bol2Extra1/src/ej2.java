import java.util.Scanner;
/**
 * Convierte a Grados Kelvin los Grados Celsius introducidos
 * @version 1.0
 * @author Fernando Piñeiro
 */
public class ej2 {
    public static void main(String[] args) {
        //recoger valores
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introduce grados Celsius: ");
        //declaro variables
        double grados = sc.nextInt();
        double kelvin = 273.15;
        //sumo las variables y las devuelvo por pantalla
        System.out.println (grados + kelvin + "  Grados Kelvin");

    }
}
