package org.pmobo.partxisa;

public class Kasilla {
    private int kasillaNum;
    private Fitxa fitxa;

    public Kasilla(int pKasillaNum, Fitxa pFitxa) {
        this.kasillaNum = pKasillaNum;
        this.fitxa = pFitxa;
    }

    public int getKasillaNum() {
        return this.kasillaNum;
    }

    public Fitxa getFitxa() {
        return this.fitxa;
    }
}
