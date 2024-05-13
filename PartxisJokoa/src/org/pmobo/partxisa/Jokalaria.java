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
        
    public int fitxarenPosizioa() {
        return this.fitxa.fitxarenPosizioa();
    }
    
    public void setFitxarenPosizioa(int pDado) {
        this.fitxa.setFitxarenPosizioa(pDado);
    }
    
	public void janDuenFitxa() {
		this.fitxa.janDuenFitxa();
	}
    
	public void fitxaJandua() {
		this.fitxa.fitxaJandua();
	}
	
	public void babestuaOkupatutaBadago() {
		this.fitxa.babestuaOkupatutaBadago();
	}
}
