package org.pmobo.partxisa;
import java.util.*;

class JokalariZerrenda {
    private static JokalariZerrenda nireJokalariZerrenda = null;
    private ArrayList<Jokalaria> jokalariak;

    private JokalariZerrenda() {
        jokalariak = new ArrayList<Jokalaria>();
    }

    public static JokalariZerrenda getNireJokalariZerrenda() {
        if (nireJokalariZerrenda == null) {
            nireJokalariZerrenda = new JokalariZerrenda();
        }
        return nireJokalariZerrenda;
    }

    public int jokalariKopEskatu() {
    	Teklatua teklatua = Teklatua.getTeklatua();
    	int jokalariKop = teklatua.jokalariKopuruaEskatu();
    	return jokalariKop;
    }
    
    public void jokalariakSortu() {
    	jokalariak.clear();
        Teklatua teklatua = Teklatua.getTeklatua();
        int numJokalariak = jokalariKopEskatu();
        for (int i = 1; i <= numJokalariak; i++) {
        	System.out.println("Jokalari " + i + " :");
        	String pIzena = teklatua.eskatuIzena();
            Fitxa pFitxa = new Fitxa(0);
            jokalariak.add(new Jokalaria(pIzena, pFitxa));
        }
    }

    public void jokalariaAukeratu() {
        boolean partidaAmaituta = false;
        int i = 0;
        while (!partidaAmaituta) {
            Jokalaria jk = jokalariak.get(i);
            System.out.println("TXANDA: " + jk.getIzena());
            System.out.println("Posizioa: " + jk.fitxarenPosizioa());
            int dadoa = jk.dadoaBota();
            System.out.println("Dadoa: " + dadoa);
            jk.posizioaAldatu();
            int posFitxa = jk.fitxarenPosizioa();
            System.out.println("POSIZIOA BERRIA: " + posFitxa);
            System.out.println("___________________________________");
            if (posFitxa == 68) {
                partidaAmaituta = true;
            }
            i++;
            if (i == jokalariak.size()) {
                i = 0;
            }
            Teklatua.getTeklatua().returnSakatu();
        }
    }
}
