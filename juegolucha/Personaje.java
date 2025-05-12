import java.util.Random;
import java.util.Scanner;

public class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected Arma arma;
    protected List<Habilidad> habilidades;

    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.arma = arma;
        this.habilidades = new ArrayList<>();
    }

    public void atacar(Personaje oponente);

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void agregarHabilidad(Habilidad h) {
        habilidades.add(h);
    }
}