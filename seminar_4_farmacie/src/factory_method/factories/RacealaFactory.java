package factory_method.factories;

import factory_method.clase.Medicament;
import factory_method.clase.Raceala;

public class RacealaFactory  extends  MedicamentFactories {
    public RacealaFactory(String denumire, double pret) {
        super(denumire, pret);
    }


    @Override
    public Medicament factoryMethod() {
        return new Raceala(super.denumire, super.pret);
    }
}
