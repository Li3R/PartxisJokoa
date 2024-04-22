package org.pmobo.partxisa;

class Jokalaria {
    private Fitxa fitxa;
    private String izena;

    public Jokalaria(String pIzena, Fitxa pFitxa) {
        this.izena = pIzena;
        this.fitxa = pFitxa;
    }
    
    public int dadoaBota(){
        int dadoa = (int) (Math.random() * 6) + 1;
        return dadoa;
    }
    
    public String getIzena() {
    	return this.izena;
    }
    
    public Fitxa getFitxa() {
    	return this.fitxa;
    }
    
    public int fitxarenPosizioa() {
    	return this.fitxa.fitxarenPosizioa();
    }
    
    public int posizioaAldatu() {
    	return this.fitxarenPosizioa() + this.dadoaBota();
    }
    
    public void printJokalari() {
    	System.out.println(this.izena);
    }
}
