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

    public Iterator<Jokalaria> getIterator() {
        return jokalariak.iterator();
    }

    public int fitxarenPosizioa() {
        return this.jokalariak.fitxarenPosizioa();
    }
    
    public void jokalariakSortu() {
        Teklatua teklatua = Teklatua.getTeklatua();
        int numJokalariak = teklatua.jokalariKopuruaEskatu();
        int i = 0;
        int pPos = 0;
        while (i < numJokalariak) {
            System.out.print("Jokalari " + i + " :");
            String pIzena = teklatua.eskatuIzena();
            Fitxa pFitxa = new Fitxa(pPos);
            Jokalaria jokalaria = new Jokalaria(pIzena,pFitxa);
            jokalariak.add(jokalaria);
            i++;
        }
    }

    public void jokalariaAukeratu() {
        Iterator<Jokalaria> itr = jokalariak.iterator();
        while (itr.hasNext()) {
            Jokalaria jk = itr.next();
            System.out.println("TXANDA: " + jk.getIzena());
            System.out.println("Posizioa: " + jk.fitxarenPosizioa());
            int dadoa = jk.dadoaBota();
            System.out.println("Dadoa: " + dadoa);
            int posFitxa = jk.getFitxa().setPos(dadoa);
            System.out.println("POSIZIOA BERRIA: " + posFitxa);
            System.out.println("___________________________________________________________");
            if (jk.fitxarenPosizioa() == 68) {
                break;
            }
            if (!itr.hasNext()) {
                itr = jokalariak.iterator();
            }
        }
    }
}