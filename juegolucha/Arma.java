import java.util.Random;
/**
 * Clase que representa un arma utilizada por un personaje.
 * Contiene un rango de daño aleatorio.
 */

public class Arma {
    private String nombre;
    private int minDano;
    private int maxDano;
    private Random rand = new Random(); // Generador de números aleatorios

// Método para calcular el daño aleatorio que inflige el arma

    public Arma(String nombre, int minDano, int maxDano) {
        this.nombre = nombre;
        this.minDano = minDano;
        this.maxDano = maxDano;
    }

    public int usar() {
        return rand.nextInt((maxDano - minDano) + 1) + minDano;
    }

    public String getNombre() {
        return nombre;
    }
}
