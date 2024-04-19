package org.pmobo.partxisa;

class Jokalaria {
    private Fitxa fitxa;
    private String izena;

    public Jokalaria(String pIzena, Fitxa pFitxa) {
        this.izena = pIzena;
        this.fitxa = pFitxa;
    }
    
    public int dadoaBota(){
        int dadoa = (int) (Math.random() * 6) + 1;
        int posFitxa=Fitxa.fitxarenPosizioa()+dadoa;
        return posFitxa;
    }
   /* public void fitxaAukeratu(){
        Teklatua t = new Teklatua();
        Boolean aurkitua = false;
        Iterator<Fitxa> itr = fitxak.getIterator();
        Fitxa f1 == t.fitxaAukeratu();
        while (!aurkitua && itr.hasNext()) {
            Fitxa f2 = itr.next();
            if (f1 == f2) {
                aurkitua = true;
            }
        }
        if (aurkitua) {
            return f2;
        } else {
            System.out.println("Fitxa ez da aurkitu");
            return null;
        }
        
    } */
    public void setIzena(String pIzena) {
        this.izena = pIzena;
    }

    public String getIzena() {
    	return this.izena;
    }
    
    public Fitxa getFitxa() {
    	return this.fitxa;
    }
    
    public int fitxarenPosizioa() {
    	return this.fitxa.fitxarenPosizioa();
    }
}

   
