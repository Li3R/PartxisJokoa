
class Teklatua {
    private Scanner scanner;

    public Teklatua() {
        scanner = new Scanner(System.in);
    }

    public String IzenaEskatu() {
        System.out.print("Zure izena sartu: ");
        return scanner.nextLine();
    }
}
