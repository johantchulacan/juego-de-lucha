// Clase base que representa a cualquier personaje en el juego (puede ser Guerrero, Mago, etc.)

public class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected Arma arma;
    protected Habilidad[] habilidades;
    protected int cantidadHabilidades;

    public Personaje(String nombre, Arma arma) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Vida inicial por defecto
        this.arma = arma;
        this.habilidades = new Habilidad[10]; // máximo 10 habilidades
        this.cantidadHabilidades = 0;
    }

    public void atacar(Personaje oponente) {
        // Método vacío, se sobrescribe en subclases
    }

    // Aplica daño al personaje
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0)
            this.puntosDeVida = 0;
    }

    // Indica si el personaje aún está vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    // Agrega una habilidad al personaje
    public void agregarHabilidad(Habilidad h) {
        if (cantidadHabilidades < habilidades.length) {
            habilidades[cantidadHabilidades++] = h;
        } else {
            System.out.println("No se pueden agregar más habilidades a " + nombre);
        }
    }

    // Retorna una habilidad específica por índice
    public Habilidad getHabilidad(int index) {
        if (index >= 0 && index < cantidadHabilidades) {
            return habilidades[index];
        }
        return null;
    }

    public int getCantidadHabilidades() {
        return cantidadHabilidades;
    }

    // MÉTODO NUEVO para obtener la primera habilidad
    public Habilidad getPrimeraHabilidad() {
        if (cantidadHabilidades > 0) {
            return habilidades[0];
        }
        return null;
    }
}
