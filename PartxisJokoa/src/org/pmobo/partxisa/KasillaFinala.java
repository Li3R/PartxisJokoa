class KasillaFinala extends Kasilla {
    private String kolorea;
    public Final(boolean pFitxaDago, int pKasillaPos, String pKolorea) {
        super(pFitxaDago, pKasillaPos);
        this.kolorea = pKolorea;

    }

    public boolean amaitu(String pKolorea) {
        boolean amaitu = false;
        if (this.kolorea == pKolorea) {
            amaitu = true;
        }
        return amaitu; 
    }
}
        
