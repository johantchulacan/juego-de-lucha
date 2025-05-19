// Clase principal que ejecuta el programa, permite al usuario ingresar nombres y lanza la pelea
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicitan nombres para los personajes
       System.out.print("Nombre del Guerrero: ");
        String nombreGuerrero = scanner.nextLine();
        Arma armaGuerrero = elegirArma(scanner);

        System.out.print("Nombre del Mago: ");
        String nombreMago = scanner.nextLine();
        Arma armaMago = elegirArma(scanner);
 // Se instancian los personajes
        Guerrero guerrero = new Guerrero(nombreGuerrero, armaGuerrero);
        Mago mago = new Mago(nombreMago, armaMago);


        // Se asignan habilidades a los personajes
     Habilidad habilidadGuerrero = elegirHabilidad(scanner, guerrero.getNombre());
    guerrero.agregarHabilidad(habilidadGuerrero);

    Habilidad habilidadMago = elegirHabilidad(scanner, mago.getNombre());
    mago.agregarHabilidad(habilidadMago);



        // Se crea e inicia el juego
        JuegoLucha juego = new JuegoLucha(guerrero, mago);
        juego.iniciarPelea();
    }

    public static Arma elegirArma(Scanner scanner) {
        while (true) {
            System.out.println("Elige un arma:");
            System.out.println("1. Espada de Hierro");
            System.out.println("2. Flecha");
            System.out.println("3. Pistola");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (opcion == 1) {
                return new EspadaHierro();
            } else if (opcion == 2) {
                return new Flecha();
            } else if (opcion == 3) {
                return new Pistola();
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }

    public static Habilidad elegirHabilidad(Scanner scanner, String nombre) {
        while (true) {
            System.out.println("Elige una habilidad para " + nombre + ":");
            System.out.println("1. Saltar");
            System.out.println("2. SuperPoder");
            System.out.println("3. Correr Rápido");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            if (opcion == 1) {
                return new Saltar();
            } else if (opcion == 2) {
                return new SuperPoder();
            } else if (opcion == 3) {
                return new CorrerRapido();
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
