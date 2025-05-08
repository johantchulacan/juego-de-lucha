import java.util.Random;
import java.util.Scanner;

// Clase Arma (Composición)
class Arma {
    private String nombre;
    private int danoExtra;

    public Arma(String nombre, int danoExtra) {
        this.nombre = nombre;
        this.danoExtra = danoExtra;
    }

    public int getDanoExtra() {
        return danoExtra;
    }

    public String getNombre() {
        return nombre;
    }
}

