package clase;

import strategy.Controlor;
import strategy.ModDePlata;

public class Validator {
    private int numarAutobuz;
    private ModDePlata metodaPlata;

    public Validator(int numarAutobuz, ModDePlata ...succesorPlata) {
        this.numarAutobuz = numarAutobuz;
        for (int i = 0; i < succesorPlata.length - 1; ++i) {
            succesorPlata[i].setSuccesor(succesorPlata[i + 1]);
        }
        succesorPlata[succesorPlata.length - 1].setSuccesor(new Controlor());
        this.metodaPlata = succesorPlata[0];
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
