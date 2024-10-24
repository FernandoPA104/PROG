import java.util.Scanner;

public class bol4ej1 {
    public static void main(String[] args) {
        System.out.println("Introduce la cantidad de articulos vendidos: ");
        Scanner sc = new Scanner(System.in);
        int articulos = sc.nextInt();
        if (articulos <=100) {
            System.out.println("tipo bajo");
        }
        if (articulos >100 && articulos <=500) {
            System.out.println("tipo medio");
        }
        if (articulos >500 && articulos <=1000) {
            System.out.println("tipo alto");
        }
        else if (articulos >1000) {
            System.out.println("Primera necesidad");
        }
    }
}
