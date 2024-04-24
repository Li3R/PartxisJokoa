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
		this.pos = this.pos + pDado;		
	}
}
