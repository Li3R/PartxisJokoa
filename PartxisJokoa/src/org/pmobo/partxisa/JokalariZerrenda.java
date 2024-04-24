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
            Fitxa pFitxa = new Fitxa();
            jokalariak.add(new Jokalaria(pIzena, pFitxa));
        }
    }

    public void jokalariaAukeratu() {
        boolean partidaAmaituta = false;
        int i = 0;
        
        while (!partidaAmaituta) {
            Jokalaria jk = jokalariak.get(i);
            jk.printJokalari();
            int dadoa = jk.dadoaBota();
            System.out.println("Dadoa: " + dadoa);
            jk.setFitxarenPosizioa(dadoa);            
            System.out.println("POSIZIOA BERRIA: " + jk.fitxarenPosizioa());
            System.out.println("___________________________________");
            if (jk.fitxarenPosizioa() >= 67) {
                partidaAmaituta = true;
            }
            i++;
            if (i == jokalariak.size()) {
                i = 0;
            }
        }
    }
}
