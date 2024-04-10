class FitxaZerrenda {
    private ArrayList<Fitxa> fitxaZerrenda;

    public FitxaZerrenda() {
        fitxaZerrenda = new ArrayList<>();
    }

    public Iterator<Fitxa> getIterator() {
        return fitxaZerrenda.iterator();
    }
    public int fitxarenPosizioa(Fitxa pFitxa) {
        return pFitxa.fitxarenPosizioa();
    }
}
