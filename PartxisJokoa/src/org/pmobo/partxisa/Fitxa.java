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
	    if (posizioBerria > 67) {
	        int gainontzekoa = posizioBerria - 67;
	        this.pos = 67 - gainontzekoa;
	    } else {
	        this.pos = posizioBerria;
	    }
	}
}
