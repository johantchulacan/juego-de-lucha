// Clase que representa una habilidad que un personaje puede tener

public class Habilidad {
    private String nombre;

    // Constructor que recibe el nombre de la habilidad
    public Habilidad(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve el nombre de la habilidad
    public String getNombre() {
        return nombre;
    }

    // Método para usar la habilidad (puede ser sobrescrito)
    public void usar() {
        System.out.println("Usando habilidad: " + nombre);
}

}