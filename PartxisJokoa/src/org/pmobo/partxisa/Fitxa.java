package org.pmobo.partxisa;

public class Fitxa {
	private int pos;
	private String kolorea;
	private String izena;
	
	public Fitxa(int pPos, String pKolorea, String pIzena) {
		this.pos = pPos;
		this.kolorea = pKolorea;
		this.izena = pIzena;
	}

	public int fitxarenPosizioa() {
		return this.pos;
	}
	public void fitxaMugitu(int pDadoaBota) {
		this.pos = this.pos + pDadoaBota;
	}
}

