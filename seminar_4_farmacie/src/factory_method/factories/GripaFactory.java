package factory_method.factories;

import factory_method.clase.Gripa;
import factory_method.clase.Medicament;

public class GripaFactory extends MedicamentFactories {
    public int valabilitate;
    public GripaFactory(String denumire, double pret, int valabilitate) {
        super(denumire, pret);
        this.valabilitate = valabilitate;
    }

    @Override
    public Medicament factoryMethod() {
        return new Gripa(super.denumire, super.pret, this.valabilitate);
    }
}
