import java.util.Scanner;
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del Guerrero: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Nombre del Mago: ");
        String nombre2 = scanner.nextLine();

        Arma espada = new Arma("Espada de Hierro", 10, 30);
        Arma baston = new Arma("Bastón Mágico", 10, 30);

        Guerrero guerrero = new Guerrero(nombre1, espada);
        Mago mago = new Mago(nombre2, baston);

        guerrero.agregarHabilidad(new Habilidad("Corte Circular"));
        mago.agregarHabilidad(new Habilidad("Bola de Fuego"));

        JuegoLucha juego = new JuegoLucha(guerrero, mago);
        juego.iniciarPelea();
    }