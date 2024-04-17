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
        for (int i = 0; i < 68; i++) {
            kasillaZerrenda.add(new Kasilla(false, i));
        }
    }
    public void tabletoaInprimatu() {
        Iterator<Kasilla> itr = getIterator();
        while (itr.hasNext()) {
            Kasilla kasilla = itr.next();
            System.out.println("Kasilla zenbakia: " + kasilla.kasillaPos);
            if (kasilla.fitxaDago) {
                System.out.println("Kasilla honetan fitxa bat dago");
            }
        
        }
    
    }
}