package org.pmobo.partxisa;

public class Fitxa {
	private int pos;
	
	public Fitxa(int pPos) {
		this.pos = pPos;
	}
	
	public int fitxarenPosizioa() {
		return this.pos;
	}
	
    public int setPos(int pPos) {
        this.pos = pPos;
		return this.pos;
    }

}