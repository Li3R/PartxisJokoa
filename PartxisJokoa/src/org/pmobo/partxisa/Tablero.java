package org.pmobo.partxisa;
import java.util.*;

class Tablero {
    private static Tablero nireTablero = null;
    private ArrayList<KasillaNormala> tablero;

    private Tablero() {
        tablero = new ArrayList<KasillaNormala>();
    }

    public static Tablero getTablero() {
        if (nireTablero == null) {
            nireTablero = new Tablero();
        }
        return nireTablero;
    }
    
    public boolean babestuaDa(int kasillaNum) {
        KasillaNormala kasilla = tablero.get(kasillaNum);
        return kasilla.babestuaDa();
    }
    
    public boolean babestuenPos(int kasillaNum) {
        return (kasillaNum > 68 && kasillaNum <= 72) || kasillaNum == 12 || kasillaNum == 17 || kasillaNum == 29 || kasillaNum == 34 || kasillaNum == 46 || 
            kasillaNum == 51 || kasillaNum == 63 || kasillaNum == 68;
    }

    public void tableroaSortu() {
        for (int kasillaNum = 0; kasillaNum < 71; kasillaNum++) {
            if (babestuenPos(kasillaNum)) {
                KasillaBabestua kasillaB = new KasillaBabestua(kasillaNum);
                tablero.add(kasillaB);
            } else {            
                KasillaNormala kasillaN = new KasillaNormala(kasillaNum);
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
