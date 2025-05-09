public class Mago extends Personaje {
    public Mago(String nombre, Arma arma) {
        super(nombre, arma);
    }


    public void atacar(Personaje oponente) {
        int dano = arma.usar() + 5;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Mago) lanza un hechizo con " + arma.getNombre() +
                           " causando " + dano + " de daño.");
    }
}