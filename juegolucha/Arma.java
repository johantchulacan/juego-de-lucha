import java.util.Random;

public class Arma {
    private String nombre;
    private int minDano;
    private int maxDano;
    private Random rand = new Random();

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
