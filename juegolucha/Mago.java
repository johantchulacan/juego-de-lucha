// Clase Mago, subclase de Personaje, representa a un personaje mago

public class Mago extends Personaje {
    public Mago(String nombre, Arma arma) {
        super(nombre, arma);
    }

    // Método de ataque del Mago que añade daño adicional
    public void atacar(Personaje oponente) {
        int dano = arma.usar() + 5;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Mago) lanza un ataque con " + arma.getNombre() +
                " causando " + dano + " de daño.");

        Habilidad habilidad = getPrimeraHabilidad();
        if (habilidad != null) {
            habilidad.usar();
        }
    }
}