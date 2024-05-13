package org.pmobo.partxisa;

public class Fitxa {
	private int pos;
	
	public Fitxa() {
		this.pos = 0;
	}
	
	public int fitxarenPosizioa() {
		return this.pos;
	}
	
	public void setFitxarenPosizioa(int pDado) {
	    int posizioBerria = this.pos + pDado;
	    if (posizioBerria > 71) {
	        int gainontzekoa = posizioBerria - 71;
	        this.pos = 71 - gainontzekoa;
	    } else {
	        this.pos = posizioBerria;
	    }
	}
	
	public void janDuenFitxa() {
		int posizioBerria = this.pos + 20;
	    if (posizioBerria > 71) {
	    	this.setFitxarenPosizioa(posizioBerria);
	    } else {
	    	this.pos = posizioBerria;
	    }
	}
	
	public void babestuaOkupatutaBadago() {
		this.pos = this.pos - 1;
        System.out.println("KASILLA OKUPATUTA ZEGOEN. POSIZIO BAT GALDU DUZU.");
	}
	
	public void fitxaJandua() {
		this.pos = 0;
	}
}
