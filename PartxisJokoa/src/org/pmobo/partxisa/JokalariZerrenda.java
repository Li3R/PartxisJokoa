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

    public void jokatu() {
        Iterator<Jokalaria> itr = jokalariak.iterator();
        while (itr.hasNext()) {
            Jokalaria jokalaria = itr.next();
            System.out.println("Jokalaria: " + jokalaria.getIzena() + ", Posizioa: " + jokalaria.fitxarenPosizioa());
            int posizioa = jokalaria.dadoaBota();
            jokalaria.getFitxa().setPos(posizioa);
            System.out.println("Posizio berria: " + posizioa);
        }
    }
}