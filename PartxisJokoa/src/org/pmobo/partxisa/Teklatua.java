package org.pmobo.partxisa;
import java.util.Scanner;

class Teklatua {
    private static Teklatua nireTeklatua;
    private Scanner scanner;

    private Teklatua() {
        scanner = new Scanner(System.in);
    }
    
    public static Teklatua getTeklatua() {
        if (nireTeklatua == null) {
            nireTeklatua = new Teklatua();
        }
        return nireTeklatua;
    }
    
    public void returnSakatu() {
        System.out.println("[Return sakatu]");
        scanner.nextLine();
    }
    
    public void returnInbisiblea() {
        scanner.nextLine();
    }
    
    public int jokalariKopuruaEskatu() throws JokalariKopTxarraException {
        System.out.print("Sartu jokalari kopurua (2 =< kop <= 4): ");
        int jokalariKop = scanner.nextInt();
        if (jokalariKop < 2 || jokalariKop > 4) {
            throw new JokalariKopTxarraException();
        }
        return jokalariKop;
    }

    public String eskatuIzena() {
        String izena = "";
        scanner.nextLine();
        izena = scanner.next();
        return izena;
    }
}
