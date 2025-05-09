public class Guerrero extends Personaje {
    public Guerrero(String nombre, Arma arma) {
        super(nombre, arma);
    }


    public void atacar(Personaje oponente) {
        int dano = arma.usar();
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Guerrero) ataca con " + arma.getNombre() +
                           " causando " + dano + " de daño.");
    }
}
