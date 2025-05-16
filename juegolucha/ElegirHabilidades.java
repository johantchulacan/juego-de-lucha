import java.util.Scanner;

public class ElegirHabilidades {

    public static Habilidad elegirHabilidad(Scanner scanner, String nombrePersonaje) {
        while (true) {
            System.out.println("Elige una habilidad " + nombrePersonaje + ":");
            System.out.println("1. Saltar");
            System.out.println("2. SuperPoder");
            System.out.println("3. Correr Rápido");
            System.out.print("Opción: ");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                if (opcion == 1) {
                    return new Saltar();
                } else if (opcion == 2) {
                    return new SuperPoder();
                } else if (opcion == 3) {
                    return new CorrerRapido();
                } else {
                    System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Ingresa un número.");
                scanner.nextLine(); // Limpiar entrada inválida
            }
        }
    }
}