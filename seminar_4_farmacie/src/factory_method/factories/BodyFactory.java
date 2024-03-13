package factory_method.factories;

import factory_method.clase.Body;
import factory_method.clase.Medicament;

public class BodyFactory extends MedicamentFactories {
    public BodyFactory(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament factoryMethod() {
        return new Body(super.denumire, super.pret);
    }
}
