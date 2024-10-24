import java.util.Scanner;

public class BOL4EJ2 {
    public static void main(String[] args) {
        //Mostramos el menu al usuario
        System.out.println(" 1 ----- Cuadrado");
        System.out.println(" 2 ----- Triangulo");
        System.out.println(" 3 ----- Circulo");
        System.out.println("Escoja la opcion deseada: ");
        //convocamos el scanner del menu
        Scanner sc = new Scanner(System.in);
        //variable que recoje el valor introducido en el scanner
        int opcion = sc.nextInt();
        //switch que muestra un texto dependiendo de la opcion elegida
        switch (opcion) {
            case 1: System.out.println("Has seleccionado Cuadrado");
            break;
            case 2: System.out.println("Has seleccionado Triangulo");
            break;
            case 3: System.out.println("Has seleccionado Circulo");
            break;
        }
        // Varios if que ejecutan diferentes funciones dependiendo de la opcion elegida
        if (opcion == 1) {
            Scanner lados = new Scanner(System.in);
            System.out.println("Introuce lado 1:  ");
            int lado = lados.nextInt();
            System.out.println("Introuce lado 2:  ");
            int lado2 = lados.nextInt();
            int areacuadrado = lado * lado2;
            System.out.println("El area del cuadrado es: " + areacuadrado);
        }
        if (opcion == 2) {
            Scanner triang = new Scanner(System.in);
            System.out.println("Introuce la base del triangulo:  ");
            int basetr = triang.nextInt();
            System.out.println("Introuce la altura del triangulo:  ");
            int alturatr = triang.nextInt();
            int areacuadrado = basetr * alturatr/2;
            System.out.println("El area del triangulo es: " + areacuadrado);
        }
        if (opcion == 3) {
            Scanner circulo = new Scanner(System.in);
            System.out.println("Introuce el radio del circulo:  ");
            int radio = circulo.nextInt();
            double pi = 3.14;
            int radio2 = radio * radio;
            double areacirculo = pi * radio2;
            System.out.println("El area del circulo es: " + areacirculo);
        }
    }
}
