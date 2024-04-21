package org.pmobo.partxisa;

public class Kasilla {
    private int numKasilla;
    private boolean okupatuta;
    private Fitxa fitxa;

    public Kasilla(int numKasilla, boolean okupatuta, Fitxa fitxa) {
        this.numKasilla = numKasilla;
        this.okupatuta = okupatuta;
        this.fitxa = fitxa;
    }

    public int getNumKasilla() {
        return this.numKasilla;
    }

    public boolean okupatutaDago() {
        return this.okupatuta;
    }

    public void fitxaJarri(Fitxa fitxa) {
        this.fitxa = fitxa;
        this.okupatuta = true;
    }

    public Fitxa fitxaLortu() {
        return this.fitxa;
    }

    public void kasillaHustu() {
        this.fitxa = null;
        this.okupatuta = false;
    }
}
