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

    public void printCasillas() {
        Iterator<Casilla> iterator = casillas.iterator();
        int position = 0;
        while (iterator.hasNext()) {
            Casilla casilla = iterator.next();
            System.out.print("Position: " + position + ", Type: " + casilla.getClass().getSimpleName());
            if (casilla instanceof Casita) {
                System.out.println(", Casita");
            } else if (casilla instanceof Inicio) {
                System.out.println(", Inicio");
            } else if (casilla instanceof Final) {
                System.out.println(", Final");
            } else {
                System.out.println(", Normal");
            }
            position++;
        }
    }
}
