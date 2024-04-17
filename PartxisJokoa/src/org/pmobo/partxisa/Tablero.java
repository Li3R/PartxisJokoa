class Tablero {
    private static Tablero nireTablero = null;
    private ArrayList<Kasilla> kasillaZerrenda;

    private Tablero() {
        tablero = new ArrayList<Kasilla>();
    }

    public static Tablero getTablero() {
        if (nireTablero == null) {
            nireTablero = new Tablero();
        }
        return nireTablero;
    }

    public void tableroaSortu() {
        for (int i = 0; i < 68; i++) {
            Kasilla kasilla = new Kasilla();
            tablero.add(kasilla);
        }
    }
    
}