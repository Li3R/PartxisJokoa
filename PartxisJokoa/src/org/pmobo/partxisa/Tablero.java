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
            Kasilla kasilla = new Kasilla(kasillaNum, null);
            tablero.add(kasilla);
        }
    }
    
    public void partidaJokatu() {
        this.tableroaSortu();
        JokalariZerrenda.getNireJokalariZerrenda().jokalariakSortu();
        boolean partidaAmaituta = false;
        
        while (!partidaAmaituta) {
            boolean todosEnUltimaCasilla = true;
            for (Jokalaria jokalaria : JokalariZerrenda.getNireJokalariZerrenda().getJokalariak()) {
                if (jokalaria.fitxarenPosizioa() != 67) {
                    todosEnUltimaCasilla = false;
                    break; // Si al menos un jugador no está en la última casilla, no es necesario continuar verificando
                }
            }
            if (todosEnUltimaCasilla) {
                partidaAmaituta = true;
            } else {
                JokalariZerrenda.getNireJokalariZerrenda().jokalariaAukeratu();
            }
        }
    }
}
