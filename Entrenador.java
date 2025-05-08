// Clase Entrenador (Agregación)
class Entrenador {
    private String nombre;
    private Personaje personaje;

    public Entrenador(String nombre, Personaje personaje) {
        this.nombre = nombre;
        this.personaje = personaje;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public String getNombre() {
        return nombre;
    }
}