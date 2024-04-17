class Tablero {
    private static Tablero nireTablero = null;
    private ArrayList<Kasilla> kasillaZerrenda;

    private Tablero() {
        casillas = new ArrayList<Kasilla>();
    }

    public static Tablero getTablero() {
        if (nireTablero == null) {
            nireTablero = new Tablero();
        }
        return nireTablero;
    }

    public Iterator<kasilla> getIterator() {
        return kasillaZerrenda.iterator();
    }

    public void tableroaSortu() {
        Iterator<Kasilla> itr = getIterator();
        while (itr.hasNext() && kasillaZerrenda.size() < 68){
            Kasilla kasilla = itr.next();
            // Do something with each Kasilla object
        }
    }

    public void tabletoaInprimatu() {
        Iterator<Kasilla> itr = getIterator();
        while (itr.hasNext()) {
            Kasilla kasilla = itr.next();
            System.out.println("Kasilla zenbakia: " + kasilla.kasillaPos + "Fitxarik dago? " + kasilla.fitxaDago);
        }
    }
}