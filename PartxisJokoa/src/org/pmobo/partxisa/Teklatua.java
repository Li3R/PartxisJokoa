
class Teklatua {
    private Scanner scanner;

    public Teklatua() {
        scanner = new Scanner(System.in);
    }

    public String pedirNombre() {
        System.out.print("Introduce tu nombre: ");
        return scanner.nextLine();
    }
}
