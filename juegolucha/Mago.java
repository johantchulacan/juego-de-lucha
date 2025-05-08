// Subclase Mago (Herencia + Polimorfismo)
class Mago extends Personaje {
    public Mago(String nombre, Arma arma) {
        super(nombre, arma);
    }

    public void atacar(Personaje oponente) {
        System.out.println("✨ " + nombre + " lanza un hechizo mágico.");
        super.atacar(oponente);
    }
}