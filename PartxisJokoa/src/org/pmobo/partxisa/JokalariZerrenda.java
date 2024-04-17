import org.pmobo.partxisa;
import java.util.ArrayList;
import java.util.Iterator;

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
        Teklatua teklatua = Teklatua.getNireTeklatua();
        int numJukalariak = teklatua.jokalariKopuruaEskatu();
        int i = 0;
        while (i < numJokalariak) {
            Jokalaria jokalaria = new Jokalaria();
            System.out.print("Jokalari " + i + " :");
            String izena = teklatua.izenaEskatu();
            jokalaria.setIzena(izena);
            jokalariak.add(jokalaria);
            i++;
        }
    }

    public void jokatu() {
        Iterator<Jokalaria> itr = jokalariak.iterator();
        while (itr.hasNext()) {
            Jokalaria jokalaria = itr.next();
            int posizioa = jokalaria.dadoaBota();
            Jokalaria fitxa = jokalaria.fitxarenPosizioa();
            fitxa = posizioa;
            System.out.println("Jokalaria: " + jokalaria.getIzena() + ", Posizioa: " + jokalaria.fitxarenPosizioa());
        }
    }
}