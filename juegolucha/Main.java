// Clase principal que ejecuta el programa, permite al usuario ingresar nombres y lanza la pelea
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicitan nombres para los personajes
       System.out.print("Nombre del Guerrero: ");
        String nombreGuerrero = scanner.nextLine();
        Arma armaGuerrero = ElegirArmas.elegirArma(scanner);

        System.out.print("Nombre del Mago: ");
        String nombreMago = scanner.nextLine();
        Arma armaMago = ElegirArmas.elegirArma(scanner);
 // Se instancian los personajes
        Guerrero guerrero = new Guerrero(nombreGuerrero, armaGuerrero);
        Mago mago = new Mago(nombreMago, armaMago);


        // Se asignan habilidades a los personajes
     Habilidad habilidadGuerrero = ElegirHabilidades.elegirHabilidad(scanner, guerrero.getNombre());
    guerrero.agregarHabilidad(habilidadGuerrero);

    Habilidad habilidadMago = ElegirHabilidades.elegirHabilidad(scanner, mago.getNombre());
    mago.agregarHabilidad(habilidadMago);



        // Se crea e inicia el juego
        JuegoLucha juego = new JuegoLucha(guerrero, mago);
        juego.iniciarPelea();
    }
}