package factory_method.factories;

import factory_method.clase.Durere;
import factory_method.clase.Medicament;

public class DurereFactory extends MedicamentFactories {
    public DurereFactory(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament factoryMethod() {
        return new Durere(super.denumire, super.pret);
    }
}
