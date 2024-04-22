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
        for (int kasillaNum = 0; kasillaNum < 68; kasillaNum++) {
            Kasilla kasilla = new Kasilla(kasillaNum,false,null);
            tablero.add(kasilla);
        }
    }
    
    public void partidaJokatu() {
        JokalariZerrenda.getNireJokalariZerrenda().jokalariakSortu();
        int tableroTamaina = tablero.size();
        
        while (true) {
            if (tableroTamaina > 0 && !tablero.get(tableroTamaina - 1).okupatutaDago() == false) {
                JokalariZerrenda.getNireJokalariZerrenda().jokalariaAukeratu();
            } 
            else {
                break;
            }
        }
    }
}
