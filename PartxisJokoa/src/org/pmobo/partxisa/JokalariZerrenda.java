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
        Iterator<Jokalaria> itr = jokalariak.iterator();
        int i = 0;
        while (itr.hasNext() && i < numJokalariak) {
            Jokalaria jokalaria = itr.next();
            i++;
            System.out.print("Jokalari " + i + " :");
            String izena = teklatua.izenaEskatu();
            jokalaria.setIzena(izena);
        }
    }
}
