class Casilla {
    private boolean fitxaDago;
    private int kasillaPos;

    public Casilla(boolean fitxaDago, int kasillaPos) {
        this.fitxaDago = fitxaDago;
        this.kasillaPos = kasillaPos;
    }

    
}

class Casita extends Casilla {
    public Casita(boolean fitxaDago, int kasillaPos) {
        super(fitxaDago, kasillaPos);

    }
}

class Inicio extends Casilla {
    public Inicio(boolean fitxaDago, int kasillaPos) {
        super(fitxaDago, kasillaPos);

    }
}

class Final extends Casilla {
    public Final(boolean fitxaDago, int kasillaPos) {
        super(fitxaDago, kasillaPos);

    }
}
