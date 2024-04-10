class Tablero {
    private static Tablero nireTablero = null;
    private ArrayList<Casilla> casillas;

    private Tablero() {
        casillas = new ArrayList<Casilla>();
    }

    public static Tablero getTablero() {
        if (nireTablero == null) {
            nireTablero = new Tablero();
        }
        return nireTablero;
    }

    public Iterator<Casilla> getIterator() {
        return casillas.iterator();
    }

    public void tableroaSortu() {
        for (int i = 0; i < 68; i++) {
            Casilla casilla = new Casilla(i);
            casillas.add(casilla);
        }
    }
}