import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Clase Carta
class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public int getValorNumerico() {
        switch (valor) {
            case "A": return 11;
            case "K":
            case "Q":
            case "J": return 10;
            default: return Integer.parseInt(valor);
        }
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}

// Clase Mazo
class Mazo {
    private List<Carta> cartas;
    private String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
    private String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Mazo() {
        cartas = new ArrayList<>();
        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
        Collections.shuffle(cartas); // Barajar el mazo
    }

    public Carta repartir() {
        return cartas.remove(0); // Repartir la primera carta del mazo
    }
}

// Clase Jugador
class Jugador {
    private List<Carta> mano;

    public Jugador() {
        mano = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        mano.add(carta);
    }

    public int calcularPuntaje() {
        int total = 0;
        int ases = 0;
        for (Carta carta : mano) {
            total += carta.getValorNumerico();
            if (carta.getValor().equals("A")) {
                ases++;
            }
        }
        // Si el total supera 21 y hay ases, ajustar su valor a 1
        while (total > 21 && ases > 0) {
            total -= 10;
            ases--;
        }
        return total;
    }

    public void mostrarMano() {
        for (Carta carta : mano) {
            System.out.println(carta);
        }
        System.out.println("Puntaje actual: " + calcularPuntaje());
    }

    public boolean estaDescalificado() {
        return calcularPuntaje() > 21;
    }
}

// Clase principal (Blackjack)
public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mazo mazo = new Mazo();
        Jugador jugador = new Jugador();
        Jugador dealer = new Jugador();

        // Repartir dos cartas al jugador y al dealer
        jugador.agregarCarta(mazo.repartir());
        jugador.agregarCarta(mazo.repartir());
        dealer.agregarCarta(mazo.repartir());
        dealer.agregarCarta(mazo.repartir());

        System.out.println("Tus cartas:");
        jugador.mostrarMano();

        // Turno del jugador
        while (true) {
            System.out.println("¿Deseas pedir otra carta? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                jugador.agregarCarta(mazo.repartir());
                jugador.mostrarMano();
                if (jugador.estaDescalificado()) {
                    System.out.println("¡Te pasaste de 21! Perdiste.");
                    return;
                }
            } else {
                break;
            }
        }

        // Turno del dealer (el dealer sigue pidiendo cartas hasta que su puntaje sea 17 o más)
        while (dealer.calcularPuntaje() < 17) {
            dealer.agregarCarta(mazo.repartir());
        }

        System.out.println("Cartas del dealer:");
        dealer.mostrarMano();

        // Determinar el ganador
        if (dealer.estaDescalificado()) {
            System.out.println("El dealer se ha pasado de 21. ¡Tú ganas!");
        } else {
            int puntajeJugador = jugador.calcularPuntaje();
            int puntajeDealer = dealer.calcularPuntaje();

            if (puntajeJugador > puntajeDealer) {
                System.out.println("¡Ganaste con " + puntajeJugador + " puntos!");
            } else if (puntajeJugador < puntajeDealer) {
                System.out.println("El dealer gana con " + puntajeDealer + " puntos.");
            } else {
                System.out.println("Empate con " + puntajeJugador + " puntos.");
            }
        }

        scanner.close();
    }
}
