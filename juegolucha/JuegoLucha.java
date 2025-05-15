//Clase que controla el flujo del juego de pelea por turnos.

public class JuegoLucha {
    
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje p1, Personaje p2) {
        this.jugador1 = p1;
        this.jugador2 = p2;
    }

// Inicia el combate entre los dos personajes hasta que uno pierda

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() +
                " y " + jugador2.getNombre() + "...");

        // Alternancia de turnos hasta que uno pierda
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo())
                turno(jugador2, jugador1);
        }

        // Resultado final
        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    // Ejecuta el turno de un personaje atacando a su oponente
    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() +
                ". Puntos de vida de " + defensor.getNombre() + ": " +
                defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " +
                defensor.getPuntosDeVida() + " puntos de vida.");
    }
}