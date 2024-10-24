import java.util.Scanner;

public class BOL5EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaracion de variables
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int numer;

        //bucle para recojer los 10 numeros requeridos
        for (int  i = 1; i <= 10; i++) {
            System.out.println ("Introduce el numero " + i + ": ");
            numer = sc.nextInt();

        //comprobamos si los numeros son negativos o positivos
        if (numer > 0) { positivos++; }
        else if (numer < 0) { negativos++; }
        else { ceros++; }
        }
        //imprime por pantalla el resultado
        System.out.println ("Positivos: " + positivos);
        System.out.println ("Negativos: " + negativos);
        System.out.println ("Ceros: " + ceros);
    }
}
