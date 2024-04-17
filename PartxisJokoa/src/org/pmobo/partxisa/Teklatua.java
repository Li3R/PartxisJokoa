class Teklatua {
    private Scanner scanner;

    public Teklatua() {
        scanner = new Scanner(System.in);
    }

    public String IzenaEskatu() {
        System.out.print("Zure izena sartu: ");
        return scanner.nextLine();
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

