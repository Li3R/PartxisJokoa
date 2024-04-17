import org.pmobo.partxisa;
import java.util.Scanner;

class Teklatua {
    private Scanner scanner;

    public Teklatua() {
        scanner = new Scanner(System.in);
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

