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
            Kasilla kasilla = new Kasilla(???,kasillaNum);
            tablero.add(kasilla);
        }
    }
    
    public void partidaJokatu() {
    	//to do.
    }
}