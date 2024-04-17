import java.util.random;
class Jokalaria {
    private Fitxa fitxa;
    private String izena;

    public Jokalaria(String pIzena, Fitxa pFitxa) {
        this.izena = pIzena;
        this.fitxa = pFitxa;
    }
    public int dadoaBota(){
        int dadoa = (int) (Math.random() * 6) + 1;
        int posFitxa = this.fitxa.fitxarenPosizioa() + dadoa;
        return posFitxa;
    }

    public void setIzena(String pIzena) {
        this.izena = pIzena;
    }
}

