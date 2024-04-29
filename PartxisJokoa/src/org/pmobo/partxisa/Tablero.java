package org.pmobo.partxisa;
import java.util.*;

class Tablero {
    private static Tablero nireTablero = null;
    private ArrayList<Kasilla> tablero;

    private Tablero() {
        tablero = new ArrayList<Kasilla>();
    }

    public static Tablero getTablero() {
        if (nireTablero == null) {
            nireTablero = new Tablero();
        }
        return nireTablero;
    }

    public void tableroaSortu() {
        for (int kasillaNum = 0; kasillaNum < 71; kasillaNum++) {
        	if ((kasillaNum > 68 && kasillaNum <= 72) || kasillaNum == 12 || kasillaNum == 17 || kasillaNum == 29 || kasillaNum == 34 || kasillaNum == 46 || 
        			kasillaNum == 51 || kasillaNum == 63 || kasillaNum == 68){
        		Kasilla kasillaB = new KasillaBabestua(kasillaNum, null);
        		tablero.add(kasillaB);
        	} else {            
        		Kasilla kasillaN = new KasillaNormala(kasillaNum, null);
        		tablero.add(kasillaN);
        	}
        }
    }
    
    public void partidaJokatu() {
        this.tableroaSortu();
        JokalariZerrenda.getNireJokalariZerrenda().jokalariakSortu();        
        JokalariZerrenda.getNireJokalariZerrenda().jokalariaAukeratu();
    }
}
