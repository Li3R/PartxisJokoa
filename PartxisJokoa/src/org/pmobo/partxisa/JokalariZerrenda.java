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
        int jokalariKop = 0;
        do {
            try {
                jokalariKop = teklatua.jokalariKopuruaEskatu();               
            } catch (JokalariKopTxarraException e) {
            	System.out.println("Jokalari kopurua baliogabea da, sartu berriro (2 =< kop <= 4)");
            }
        } while (jokalariKop < 2 || jokalariKop > 4);
        
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
            
            int pNewPos = jk.fitxarenPosizioa();
            if (this.fitxaDago(pNewPos, jk) && jk.fitxarenPosizioa() != 0 && jk.fitxarenPosizioa() != 1 && 
            		Tablero.getTablero().babestuaDa(pNewPos)) {
            	jk.babestuaOkupatutaBadago();
            } 
            else if (this.fitxaDago(pNewPos, jk) && jk.fitxarenPosizioa() != 0 && jk.fitxarenPosizioa() != 1 && 
            		!Tablero.getTablero().babestuaDa(pNewPos)){
            	jk.janDuenFitxa();
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
    
    public boolean fitxaDago(int pNewPos, Jokalaria jokalaria) {
        Iterator<Jokalaria> itr = jokalariak.iterator();
        boolean babestuaOkupatuta = false;
        while (itr.hasNext() && !babestuaOkupatuta) {
            Jokalaria jok = itr.next();
            if (!jok.equals(jokalaria)) {
                int posizioa = jok.fitxarenPosizioa();
                if (posizioa == pNewPos && posizioa > 0) {
                    babestuaOkupatuta = true;
                    if (!Tablero.getTablero().babestuaDa(pNewPos)) {
                    jok.fitxaJandua();
                    System.out.println("ÑAM-ÑAM!");
                    System.out.println(jok.getIzena() + " 0 posiziora bueltatu du.");
                    }
                }
            }
        }
        return babestuaOkupatuta;
    }
}
