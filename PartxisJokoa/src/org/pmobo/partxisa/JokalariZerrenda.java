class JokalariZerrenda {
    private static JokalariZerrenda nireJokalariZerrenda = null;
    private ArrayList<Jugador> jokalariak;

    private JokalariZerrenda() {
        jokalariak = new ArrayList<Jugador>();
    }

    public static JokalariZerrenda getNireJokalariZerrenda() {
        if (nireJokalariZerrenda == null) {
            nireJokalariZerrenda = new JokalariZerrenda();
        }
        return nireJokalariZerrenda;
    }

    // Implementación de métodos para gestionar la lista de jugadores
    // ...

    public void repartirTurnos() {
        // Implementación para repartir los turnos entre los jugadores
    }
}
