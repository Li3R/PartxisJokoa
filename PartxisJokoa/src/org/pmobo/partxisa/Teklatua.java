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
}