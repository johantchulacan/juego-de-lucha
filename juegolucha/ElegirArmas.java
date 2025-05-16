import java.util.Scanner;

public class ElegirArmas {

    public static Arma elegirArma(Scanner scanner) {
        while (true) {
            System.out.println("Elige un arma:");
            System.out.println("1. Espada de Hierro");
            System.out.println("2. Flecha");
            System.out.println("3. Pistola");
            System.out.print("Opción: ");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer

                if (opcion == 1) {
                    return new EspadaHierro();
                } 
                 else if (opcion == 2) {
                    return new Flecha();
                } else if (opcion == 3) {
                    return new Pistola();
                } else {
                    System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Ingresa un número.");
                scanner.nextLine(); // limpiar entrada no numérica
            }
        }
    }
}