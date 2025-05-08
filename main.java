public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del entrenador 1: ");
        String nomEntrenador1 = scanner.nextLine();
        System.out.print("Nombre del guerrero: ");
        String nomGuerrero = scanner.nextLine();
        Arma espada = new Arma("Espada de Fuego", 5);
        Guerrero guerrero = new Guerrero(nomGuerrero, espada);
        Entrenador entrenador1 = new Entrenador(nomEntrenador1, guerrero);

        System.out.print("Nombre del entrenador 2: ");
        String nomEntrenador2 = scanner.nextLine();
        System.out.print("Nombre del mago: ");
        String nomMago = scanner.nextLine();
        Arma baston = new Arma("Bastón Mágico", 3);
        Mago mago = new Mago(nomMago, baston);
        Entrenador entrenador2 = new Entrenador(nomEntrenador2, mago);

        JuegoLucha juego = new JuegoLucha(entrenador1.getPersonaje(), entrenador2.getPersonaje());
        juego.iniciarPelea();
    
}