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
        kasillaZerrenda = new ArrayList<Kasilla>();

        for (int i = 0; i < 68; i++) {
            kasillaZerrenda.add(new Kasilla(false, i));
        }
    }
}


public void jokatu(){
    jokalari1= new Jokalaria("Bot");
    jokalari2= new Jokalaria("Asier");

}

