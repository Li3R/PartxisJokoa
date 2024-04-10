class Tablero {
    private static Tablero nireTablero = null;
    private ArrayList<Kasilla> Kasilla;

    private Tablero() {
        kasillak = new ArrayList<Kasilla>();
    }

    public static Tablero getTablero() {
        if (nireTablero == null) {
            nireTablero = new Tablero();
        }
        return nireTablero;
    }

    private Iterator<Kasilla> getIterator() {
        return kasillak.iterator();
    }

  