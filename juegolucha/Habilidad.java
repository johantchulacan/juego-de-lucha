// Clase que representa una habilidad que un personaje puede tener

public class Habilidad {
    private String nombre;

    public Habilidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void usar() {
        System.out.println("Usando habilidad: " + nombre);
}

}