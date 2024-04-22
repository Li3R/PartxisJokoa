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
        System.out.println("Dadoa: " + dadoa);
        int posFitxa = this.fitxa.fitxarenPosizioa();
        return posFitxa;
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
}
