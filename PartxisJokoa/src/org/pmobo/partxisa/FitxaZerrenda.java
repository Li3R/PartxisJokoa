class FitxaZerrenda {
    private ArrayList<Fitxa> fitxaZerrenda;

    public FitxaZerrenda() {
        fitxaZerrenda = new ArrayList<>();
    }

    public Iterator<Fitxa> getIterator() {
        return fitxaZerrenda.iterator();
    }
}
public void addFitxas() {
    for (int i = 1; i <= 4; i++) {
        Fitxa fitxa = new Fitxa(i);
        fitxaZerrenda.add(fitxa);
        fitxa.setName("fitxa" + i);
    }
}
