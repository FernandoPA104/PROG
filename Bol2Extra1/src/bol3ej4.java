import java.util.Scanner;

/**
 * Clase que pide nombre y peso y devuelve la diferencia
 * @version 1.0
 * @author Fernando Piñeiro
 */

public class bol3ej4 {
    public static void main(String[] args) {
        //ejericicio peso
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la primera persona: ");
        //
        String nome1 = sc.nextLine();
        System.out.println("Introduce el nombre de la segunda persona: ");
        String nome2 = sc.nextLine();

        System.out.println("Introduce el peso de " + nome1 + ":");
        int peso1 = sc.nextInt();
        System.out.println("Introduce el peso " + nome2 + ":");
        int peso2 = sc.nextInt();

        if (peso1 > peso2) {
            System.out.println("la persona mas pesada es: " + nome1);
        }
        else if (peso1 < peso2) {System.out.println("la mas pesada es: " + nome2);}

        int diferencia = peso1 - peso2;

        if (peso1 > peso2) {diferencia = peso1 - peso2;}
        else if (peso2 > peso1) {diferencia = peso2 - peso1;}

        if (peso2 > peso1) {System.out.println(nome1 + " pesa " + diferencia + " kilos " + " menos que " + nome2);}
        else if (peso1 > peso2) {System.out.println(nome1 + " pesa " + diferencia + " kilos " + " mas que " + nome2);}
    }
}
