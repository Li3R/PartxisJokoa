package org.pmobo.partxisa;

public class Fitxa {
	private int pos;
	private String kolorea;
	
	public Fitxa(int pPos, String pKolorea) {
		this.pos = pPos;
		this.kolorea = pKolorea;
	}

	public int fitxarenPosizioa() {
		return this.pos;
	}
}

