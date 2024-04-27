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
        	System.out.println("Jokalari " + i + " , sartu izena:");
        	String pIzena = teklatua.eskatuIzena();
            Fitxa pFitxa = new Fitxa();
            jokalariak.add(new Jokalaria(pIzena, pFitxa));
        }
    }

    public void jokalariaAukeratu() {
        Teklatua teklatua = Teklatua.getTeklatua();
        
        ArrayList<Jokalaria> amaierakoLista = new ArrayList<Jokalaria>();            
        int i = 0;
        
        System.out.println(" ");
        System.out.println("PARTIDA HASI");
        teklatua.returnInbisiblea();
        Jokalaria hJokalari = jokalariak.get(i);
        System.out.println("Hasten den jokalaria: " + hJokalari.getIzena());
        teklatua.returnSakatu();

        while (!this.partidaAmaituta()) {
            Jokalaria jk = jokalariak.get(i);

            System.out.println(jk.getIzena());
            System.out.println("Posizioa: " + jk.fitxarenPosizioa());
            int dadoa = jk.dadoaBota();

            if (dadoa != 5 && jk.fitxarenPosizioa() == 0) {
                jk.setFitxarenPosizioa(0);
            } else if (dadoa == 5 && jk.fitxarenPosizioa() == 0) {
                jk.setFitxarenPosizioa(1);
            } else {
                jk.setFitxarenPosizioa(dadoa);
            }

            int pos = jk.fitxarenPosizioa();
            System.out.println("Dadoa: " + dadoa);
            System.out.println("POSIZIOA BERRIA: " + pos);
            System.out.println("___________________________________");

            hJokalari = jokalariak.get((i+1) % jokalariak.size());
            System.out.println("HURRENGOA: " + hJokalari.getIzena());
            teklatua.returnSakatu();
                                  
            if (jk.fitxarenPosizioa() >= 71) {
                amaierakoLista.add(jk);
                jokalariak.remove(i);
                i--;
            }
            
            i++;
            
            if (i >= jokalariak.size()) {
                i = 0;
            } 
        }
        
        System.out.println("");
        System.out.println("PARTIDA AMAITUTA, emaitzak:");
        int j = 0;
        while (j < amaierakoLista.size()) {
            Jokalaria jk = amaierakoLista.get(j);
            System.out.println((j + 1) + ". " + jk.getIzena() );
            j++;
        }
    }
    
    private boolean partidaAmaituta() {
    	boolean amaituta = false;
        if (jokalariak.size() == 0) {
            amaituta = true;
        }
        return amaituta;
    }
}
