// Clase principal que ejecuta el programa, permite al usuario ingresar nombres y lanza la pelea
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicitan nombres para los personajes
        System.out.print("Nombre del Guerrero: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Nombre del Mago: ");
        String nombre2 = scanner.nextLine();

        // Se crean armas para cada personaje
        Arma espada = new Arma("Espada de Hierro", 10, 30);
        Arma baston = new Arma("Bastón Mágico", 10, 30);

        // Se instancian los personajes
        Guerrero guerrero = new Guerrero(nombre1, espada);
        Mago mago = new Mago(nombre2, baston);

        // Se asignan habilidades a los personajes
        guerrero.agregarHabilidad(new Habilidad("Corte Circular"));
        mago.agregarHabilidad(new Habilidad("Bola de Fuego"));

        // Se crea e inicia el juego
        JuegoLucha juego = new JuegoLucha(guerrero, mago);
        juego.iniciarPelea();
    }
}