// Clase Guerrero, subclase de Personaje, representa a un luchador cuerpo a cuerpo

public class Guerrero extends Personaje {
    public Guerrero(String nombre, Arma arma) {
        super(nombre, arma);
    }

// Método de ataque específico para el Guerrero

    public void atacar(Personaje oponente) {
        int dano = arma.usar();
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Guerrero) ataca con " + arma.getNombre() +
                           " causando " + dano + " de daño.");
        
        Habilidad habilidad = getPrimeraHabilidad();
        if (habilidad != null) {
            habilidad.usar();
        }
    }
}
