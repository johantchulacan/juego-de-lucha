// Subclase Guerrero (Herencia + Polimorfismo)
class Guerrero extends Personaje {
    public Guerrero(String nombre, Arma arma) {
        super(nombre, arma);
    }

    public void atacar(Personaje oponente) {
        System.out.println("¡" + nombre + " ataca como un Guerrero feroz!");
        super.atacar(oponente);
    }
}
