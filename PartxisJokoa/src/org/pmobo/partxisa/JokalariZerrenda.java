class JokalariZerrenda {
    private static JokalariZerrenda nireJokalariZerrenda = null;
    private ArrayList<Jokalaria> jokalariak;

    private JokalariZerrenda() {
        jokalariak = new ArrayList<Jokalaria>();
    }

    public static JokalariZerrenda getNireJokalariZerrenda() {
        if (nireJokalariZerrenda == null) {
            nireJokalariZerrenda = new JokalariZerrenda();
        }
        return nireJokalariZerrenda;
    }

    public Iterator<Jokalaria> getIterator() {
        return jokalariak.iterator();
    }
    
    
}
public void crearJokalariak() {
    Teklatua teklatua = Teklatua.getNireTeklatua();
    int numJugadores = teklatua.jokalariKopuruaEskatu();

    Iterator<Jokalaria> iterator = jokalariak.iterator();
    int i = 0;
    while (iterator.hasNext() && i < numJugadores) {
        Jokalaria jokalaria = iterator.next();
        i++;
        System.out.print("Introduce el nombre del jugador " + i + ": ");
        String izena = teklatua.IzenaEskatu();
        jokalaria.setIzena(izena);
    }
}
