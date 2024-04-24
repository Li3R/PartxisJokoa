package org.pmobo.partxisa;

public class Kasilla {
    private int numKasilla;
    private Fitxa fitxa;

    public Kasilla(int pNumKasilla, Fitxa pFitxa) {
        this.numKasilla = pNumKasilla;
        this.fitxa = pFitxa;
    }

    public int getNumKasilla() {
        return this.numKasilla;
    }

    public boolean irabazleaDago() {
    	if(this.fitxa != null) {
    		return true;
    	}
    	return false;
    }
}
