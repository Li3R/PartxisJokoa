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
    
    public int jokalariKopuruaEskatu() {
        System.out.print("Sartu jokalari kopurua: ");
        return scanner.nextInt();
    }

    public String eskatuIzena() {
        System.out.print("Sartu izena: ");
        String izena = scanner.nextLine();
        return izena;
    }
    public int jokalariKopuruAukeratu() {
        System.out.print("Jokalari kopurua aukeratu: ");
        return scanner.nextInt();
    }
    public int fitxaAukeratu() {
        System.out.print("Aukeratu fitxa zenbakia: ");
        return scanner.nextInt();
    }
    public int jokalariKopuruaEskatu() {
        System.out.print("Sartu jokalari kopurua: ");
        return scanner.nextInt();
    }

    public void eskatuIzena() {
        System.out.print("Sartu izena: ");
        String izena = scanner.nextLine();
        
    }
}

