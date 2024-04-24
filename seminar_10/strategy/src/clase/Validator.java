package clase;

import strategy.ModDePlata;

public class Validator {
    private int numarAutobuz;
    private ModDePlata metodaPlata;

    public Validator(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
        this.metodaPlata = null;
    }

    public ModDePlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(ModDePlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void valideazaCalatorie(double pret) {
        this.metodaPlata.plateste(pret);
    }
}
